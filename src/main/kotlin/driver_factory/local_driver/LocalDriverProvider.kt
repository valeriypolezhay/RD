package driver_factory.local_driver

import io.appium.java_client.remote.AndroidMobileCapabilityType.*
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.MobileCapabilityType.*
import org.openqa.selenium.Platform
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.CapabilityType

import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL

class LocalDriverProvider {

    /**
     * Gets driver for local(emulator or device connected to PC) device
     */
    fun getDriver(screenOrientation: String): WebDriver {
//        TODO("Add implementation - maybe done")
        val capabilities = DesiredCapabilities()
        capabilities.setCapability(DEVICE_NAME, "emulator-5554")
        capabilities.setCapability(AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2)
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANDROID)
        capabilities.setCapability(PLATFORM_VERSION, "7.1.1")
        capabilities.setCapability(APP_PACKAGE, "com.myapp.android")
        capabilities.setCapability(APP_ACTIVITY, "com.myapp.android.HomeActivity")
        capabilities.setCapability(AUTO_GRANT_PERMISSIONS, true)
        capabilities.setCapability("screenOrientation",screenOrientation)

        return RemoteWebDriver(URL("http://0.0.0.0.4723"), capabilities)
    }
}