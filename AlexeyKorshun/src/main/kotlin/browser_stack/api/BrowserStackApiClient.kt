package browser_stack.api

import browser_stack.api.exceptions.AuthorizationException
import browser_stack.api.exceptions.BrowserStackApiException
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class BrowserStackApiClient {

    private val apiProvider: BrowserStackApiProvider = BrowserStackApiProvider()

    fun checkApiStatus(): Boolean {
        val apiResponseTriple = apiProvider.checkApiStatusResult()
        val apiStatusResponse = apiResponseTriple.second

        return when (apiStatusResponse.statusCode) {
            200 -> {
                logger.info { "BrowserStack API is accessible" }
                true
            }
            401 -> {
                logger.error {
                    """An error occurs while authorization process
                Check your bsCommonConfig
                Response message: ${apiStatusResponse.responseMessage}"""
                }
                throw AuthorizationException("""
                    BrowserStack API is not accessible,
                    an error occurred during authorization process,
                    see logs for additional details""")
            }
            else -> {
                logger.error {
                    """
                    BrowserStack API is not accessible
                    Response status code: ${apiStatusResponse.statusCode}
                    Response message: ${apiStatusResponse.responseMessage}
                    """
                }
                throw BrowserStackApiException("BrowserStack API is not accessible, see logs for additional details")
            }
        }
    }

    fun uploadApp(): String {
        val appUrlKey = "app_url"

        val apiResponseTriple = apiProvider.uploadAppResult()
        val appUploadResponse = apiResponseTriple.second
        val appUploadResult = apiResponseTriple.third

        appUploadResult.fold(
                { data ->
                    try {
                        logger.info { "Api_url is ${data[appUrlKey].textValue()} value" }
                        return data[appUrlKey].textValue()
                    } catch (ex: BrowserStackApiException) {
                        logger.error { "Can't find key $appUrlKey in response object" }
                        throw ex
                    }
                },
                { err ->
                    logger.error {
                        """
                    Response headers: ${appUploadResponse.headers}
                    Response status code: ${appUploadResponse.statusCode}
                    Response message: ${appUploadResponse.responseMessage}
                    """
                    }
                    throw BrowserStackApiException("Exception message: ${err.exception.message}")
                }
        )
    }

    fun deleteApp(appUrl: String) {

        //we should truncate incoming appId as it comes to us in ~bs://appId~ format
        val truncatedAppId = appUrl.drop(5)

        val apiResponseTriple = apiProvider.deleteApp(truncatedAppId)
        val deleteAppResponse = apiResponseTriple.second
        val deleteAppResult = apiResponseTriple.third

        deleteAppResult.fold(
                { data ->
                    if (data["success"].asBoolean()) {
                        logger.info { "App with $truncatedAppId successfully deleted" }
                    } else {
                        logger.error { "There'find no app with $truncatedAppId to delete in BrowserStack cloud" }
                        throw IllegalArgumentException("Invalid $truncatedAppId passed in DELETE request")
                    }
                },
                { err ->
                    logger.error {
                        """
                    Response headers: ${deleteAppResponse.headers}
                    Response status code: ${deleteAppResponse.statusCode}
                    Response message: ${deleteAppResponse.responseMessage}
                    """
                    }
                    throw BrowserStackApiException("Exception message: ${err.exception.message}")
                }
        )
    }
}