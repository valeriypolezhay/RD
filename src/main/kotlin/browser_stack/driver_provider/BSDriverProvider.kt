package browser_stack.driver_provider

import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.Platform
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL

class BSDriverProvider() {

    /**
     * Creates driver for desired capabilityName
     * @capabilityName - name of capability for desired device
     * @screenOrientation - orientation of device screen.
     */
    fun getDriver(capabilityName: String, screenOrientation: String): WebDriver {
//        TODO("Add implementation - maybe done")
        val capabilities = DesiredCapabilities()
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "")
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2)
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANDROID)
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1")
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.myapp.android")
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.myapp.android.HomeActivity")
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true)
        capabilities.setCapability("capabilityName", capabilityName)
        capabilities.setCapability("screenOrientation", screenOrientation)

        return RemoteWebDriver(URL("https://valerii39:nymRAPPKeUwsGy1d1yNF@hub.browserstack.com/wd/hub"), capabilities)


    }
}