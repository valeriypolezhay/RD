package browser_stack.capabilities.model

data class BSDeviceCapabilitiesModel(
    val device: String,
    val os: String,
    val osVersion: String,
    val appiumVersion: String
)