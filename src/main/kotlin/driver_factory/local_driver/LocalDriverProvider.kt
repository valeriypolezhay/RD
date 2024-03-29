package driver_factory.local_driver

import com.codeborne.selenide.SelenideElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType.*
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.MobileCapabilityType
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

        capabilities.setCapability(DEVICE_NAME, "5641a5a7")
        capabilities.setCapability(AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2)
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANDROID)
        capabilities.setCapability(PLATFORM_VERSION, "9")
        capabilities.setCapability(APP_PACKAGE, "com.planet.imax")
        capabilities.setCapability(APP_ACTIVITY, "com.planetakino.app.presentation.activity.RootActivity")
        capabilities.setCapability(AUTO_GRANT_PERMISSIONS, true)
        capabilities.setCapability("screenOrientation", screenOrientation)

        return AndroidDriver<SelenideElement>(URL("http://127.0.0.1:4723/wd/hub"), capabilities)
    }
}