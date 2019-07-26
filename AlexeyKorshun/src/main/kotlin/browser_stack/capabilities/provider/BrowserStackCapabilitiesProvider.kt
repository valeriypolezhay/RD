package browser_stack.capabilities.provider

import browser_stack.capabilities.capability_finder.BSDeviceCapabilityFinder
import browser_stack.capabilities.singleton.BSCommonCapabilitiesSingleton
import io.appium.java_client.remote.AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS
import io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION
import io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME
import io.appium.java_client.remote.MobileCapabilityType.ORIENTATION
import org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME
import org.openqa.selenium.remote.DesiredCapabilities

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
        //        TODO - done!
        desiredCapabilities.setCapability("realMobile", "true")
        desiredCapabilities.setCapability(DEVICE_NAME, deviceCapabilities.device)
        desiredCapabilities.setCapability(PLATFORM_NAME, deviceCapabilities.os)
        desiredCapabilities.setCapability(PLATFORM_VERSION, deviceCapabilities.osVersion)
        desiredCapabilities.setCapability("appiumVersion", deviceCapabilities.appiumVersion)
        desiredCapabilities.setCapability(ORIENTATION, screenOrientation.toUpperCase())

        desiredCapabilities.setCapability("project", commonCapabilities.project)
        desiredCapabilities.setCapability("automationName", commonCapabilities.automationName)
        desiredCapabilities.setCapability("acceptSslCerts", commonCapabilities.acceptSslCerts)
        desiredCapabilities.setCapability(AUTO_GRANT_PERMISSIONS, commonCapabilities.autoGrantPermissions)
    }
}