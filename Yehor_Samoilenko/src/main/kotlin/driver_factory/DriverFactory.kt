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

        return when (driverName) {
            "local" -> {
                LocalDriverProvider().getDriver(screenOrientation)
            }
            "BSdriver" -> {
                BSDriverProvider().getDriver(deviceName, screenOrientation)
            }
            else -> throw Exception("Wrong deviceName: $deviceName.")
        }
    }
}