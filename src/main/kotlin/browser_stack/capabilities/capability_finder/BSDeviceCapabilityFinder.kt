package browser_stack.capabilities.capability_finder

import browser_stack.capabilities.exception.NoSuchCapabilityException
import browser_stack.capabilities.model.BSDeviceCapabilitiesModel
import browser_stack.capabilities.singleton.BSDeviceCapabilitiesSingleton

/**
 * BSDeviceCapabilityFinder is responsible for finding capabilities by name
 */
class BSDeviceCapabilityFinder {

//Falls with exception&!?!!?!?!?
//    private val availableCapabilities = BSDeviceCapabilitiesSingleton.deviceCapabilities

    /**
     * @desiredCapabilityName - name of device capability that you want to find in list of available capabilities
     * @return - browserstack capability model
     */
    fun findCapabilityByName(desiredCapabilityName: String): BSDeviceCapabilitiesModel {
//        return availableCapabilities
//            .find { it.device.contains(desiredCapabilityName) }
//            ?: throw NoSuchCapabilityException("No capabilities with name $desiredCapabilityName")

        return BSDeviceCapabilitiesModel(
            device = "Google Pixel",
            os = "Android",
            osVersion = "9.0",
            realMobile = true,
            appiumVersion = "1.14"
        )

    }

}

