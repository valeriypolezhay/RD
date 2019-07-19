package browser_stack.capabilities.provider

import browser_stack.capabilities.capability_finder.BSDeviceCapabilityFinder
import browser_stack.capabilities.singleton.BSCommonCapabilitiesSingleton
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
      //  TODO("Add implementation - maybe done")
        desiredCapabilities.setCapability("device",deviceCapabilities.device)
        desiredCapabilities.setCapability("os",deviceCapabilities.os)
        desiredCapabilities.setCapability("osVersion",deviceCapabilities.osVersion)
        desiredCapabilities.setCapability("appiumVersion",deviceCapabilities.appiumVersion)

        desiredCapabilities.setCapability( "project",commonCapabilities.project)
        desiredCapabilities.setCapability( "automationName",commonCapabilities.automationName)
        desiredCapabilities.setCapability( "acceptSslCerts",commonCapabilities.acceptSslCerts)
        desiredCapabilities.setCapability( "autoGrantPermissions",commonCapabilities.autoGrantPermissions)

    }
}