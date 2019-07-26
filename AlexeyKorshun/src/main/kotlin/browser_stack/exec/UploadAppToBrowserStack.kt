@file:JvmName("UploadAppToBrowserStack")

package browser_stack.exec

import browser_stack.api.BrowserStackApiController

fun main(args: Array<String>) {

    BrowserStackApiController().executeUploadApp()

}