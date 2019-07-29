package browser_stack.capabilities.provider

import browser_stack.capabilities.capability_finder.BSDeviceCapabilityFinder
import browser_stack.capabilities.singleton.BSCommonCapabilitiesSingleton
import com.codeborne.selenide.WebDriverRunner.url
import io.appium.java_client.remote.AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS
import io.appium.java_client.remote.MobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME
import io.appium.java_client.remote.MobileCapabilityType.ORIENTATION
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL

/**
 * Provides BrowserStack capability by capabilityName
 * @capabilityName - name of desired capability
 * @screeenOrientation - orientation of device screen.
 */
class BrowserStackCapabilitiesProvider(capabilityName: String, private val screenOrientation: String) {

    val desiredCapabilities = DesiredCapabilities()
    private val commonCapabilities = BSCommonCapabilitiesSingleton.commonCapabilities
    private val deviceCapabilities = BSDeviceCapabilityFinder().findCapabilityByName(capabilityName)

    init {
        setCapability()
    }

    /**
     * Set capabilities to desiredCapabilities variable
     */
    private fun setCapability() {

        desiredCapabilities.setCapability("realMobile", "true")

        desiredCapabilities.setCapability(DEVICE_NAME, deviceCapabilities.device)
        desiredCapabilities.setCapability(PLATFORM_NAME, deviceCapabilities.os)
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, deviceCapabilities.osVersion)
        desiredCapabilities.setCapability("appiumVersion", deviceCapabilities.appiumVersion)

        desiredCapabilities.setCapability(ORIENTATION, screenOrientation.toUpperCase())

        desiredCapabilities.setCapability("project", commonCapabilities.project)
        desiredCapabilities.setCapability("automationName", commonCapabilities.automationName)
        desiredCapabilities.setCapability("acceptSslCerts", commonCapabilities.acceptSslCerts)
        desiredCapabilities.setCapability(AUTO_GRANT_PERMISSIONS, commonCapabilities.autoGrantPermissions)
    }
}