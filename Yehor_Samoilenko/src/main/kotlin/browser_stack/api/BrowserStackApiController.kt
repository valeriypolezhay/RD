package browser_stack.api

import browser_stack.supplier_fileds.BrowserStackSupplierFieldWriter
import browser_stack.supplier_fileds.BrowserStackSupplierFieldsProvider
import browser_stack.supplier_fileds.exceptions.SupplierFieldException

class BrowserStackApiController {

    fun executeUploadApp() {
        val appUrl = BrowserStackApiClient().uploadApp()
        BrowserStackSupplierFieldWriter().setFieldValueToJsonFile("apkPath", appUrl)
    }

    fun executeDeleteApp() {
        val appUrl = BrowserStackSupplierFieldsProvider().supplierFields.apkPath
                ?: throw SupplierFieldException("'apkPath' field must not be empty.")
        BrowserStackApiClient().deleteApp(appUrl)
    }

    fun executeCheckApi() {
        BrowserStackApiClient().checkApiStatus()
    }
}