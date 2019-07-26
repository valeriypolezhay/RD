package browser_stack.api

import browser_stack.config.models.BSCommonConfigModel
import browser_stack.config.singleton.BSCommonConfigSingleton
import com.fasterxml.jackson.databind.node.ObjectNode
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.*
import com.github.kittinunf.fuel.jackson.jacksonDeserializerOf
import com.github.kittinunf.result.Result
import mu.KotlinLogging
import java.io.File
import java.util.*

private val logger = KotlinLogging.logger {}

class BrowserStackApiProvider {

    private val bsCommonConfig: BSCommonConfigModel = BSCommonConfigSingleton.commonConfig
    private var fuelClient = FuelManager.instance

    init {

        fuelClient.basePath = bsCommonConfig.appAutomateUrl

        val base64EncodedCredentials = Base64.getEncoder()
            .encodeToString("${bsCommonConfig.userName}:${bsCommonConfig.key}".toByteArray(Charsets.UTF_8))
        logger.debug {
            """Username = ${bsCommonConfig.userName}
                          Key = ${bsCommonConfig.key}"""
        }

        fuelClient.baseHeaders = mapOf("Authorization" to "Basic $base64EncodedCredentials")
    }

    fun checkApiStatusResult(): Triple<Request, Response, Result<ObjectNode, FuelError>> {
        val checkApiStatusUrl = "${fuelClient.basePath}/plan.json"

        val (request, response, result) = Fuel.get(checkApiStatusUrl)
            .responseObject(jacksonDeserializerOf<ObjectNode>())

        logger.info { checkApiStatusUrl }

        return Triple(request, response, result)
    }

    fun uploadAppResult(): Triple<Request, Response, Result<ObjectNode, FuelError>> {
        val uploadAppUrl = "${fuelClient.basePath}/upload"
        val file = File(bsCommonConfig.appPath)
        println(file.absolutePath)

        val (request, response, result) = Fuel.upload(uploadAppUrl, Method.POST)
            .timeout(5000)
            .timeoutRead(60000)
            .name { "file" }
            .source { _, _ -> file }
            .responseObject(jacksonDeserializerOf<ObjectNode>())

        logger.info { uploadAppUrl }

        return Triple(request, response, result)
    }

    fun deleteApp(appId: String): Triple<Request, Response, Result<ObjectNode, FuelError>> {
        val deleteAppUrl = "${fuelClient.basePath}/app/delete/$appId"

        val (request, response, result) = Fuel.delete(deleteAppUrl)
            .responseObject(jacksonDeserializerOf<ObjectNode>())

        logger.info { deleteAppUrl }

        return Triple(request, response, result)
    }
}