package driver_factory

import browser_stack.driver_provider.BSDriverProvider
import driver_factory.local_driver.LocalDriverProvider
import org.openqa.selenium.WebDriver

class DriverFactory {

    /**
     * Provides driver by driver name(ex. browserStack or local)
     * @driverName - name of desired driver
     * @deviceName - name of desired device
     * @screenOrientation - orientation of device screen.
     */
    fun getDriver(driverName: String, deviceName: String, screenOrientation: String): WebDriver {
//        TODO("Add implementation - maybe done")

        val localDriverProvider = LocalDriverProvider()
        val bsDriverProvider = BSDriverProvider()
        var webDriver: WebDriver? = null


        when (driverName) {
            "local" -> webDriver = localDriverProvider.getDriver(screenOrientation)
            "BSdriver" -> webDriver = bsDriverProvider.getDriver(deviceName, screenOrientation)
        }
        return webDriver!!
    }

}