@file:JvmName("DeleteAppFromBrowserStack")

package browser_stack.exec

import browser_stack.api.BrowserStackApiController

fun main(args: Array<String>) {

    BrowserStackApiController().executeDeleteApp()

}