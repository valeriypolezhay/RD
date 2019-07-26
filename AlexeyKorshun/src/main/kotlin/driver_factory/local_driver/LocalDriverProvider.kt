package driver_factory.local_driver

import com.codeborne.selenide.SelenideElement
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType.*
import io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2
import io.appium.java_client.remote.MobileCapabilityType.*
import org.openqa.selenium.Platform.ANDROID
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

class LocalDriverProvider {

    /**
     * Gets driver for local(emulator or device connected to PC) device
     */
    fun getDriver(screenOrientation: String, deviceName:String): WebDriver {
        //        TODO - done!
        val capabilities = DesiredCapabilities()
        capabilities.setCapability(DEVICE_NAME, deviceName)
        capabilities.setCapability(AUTOMATION_NAME, ANDROID_UIAUTOMATOR2)
        capabilities.setCapability(PLATFORM_NAME, ANDROID)
        capabilities.setCapability(PLATFORM_VERSION, 9.0)
        capabilities.setCapability(APP_PACKAGE, "com.candl.athena")
        capabilities.setCapability(APP_ACTIVITY, "activity.Calculator")
        capabilities.setCapability(AUTO_GRANT_PERMISSIONS, true)
        capabilities.setCapability("screenOrientation", screenOrientation)

        return AndroidDriver<SelenideElement>(URL("http://0.0.0.0:4723/wd/hub"), capabilities)
    }
}