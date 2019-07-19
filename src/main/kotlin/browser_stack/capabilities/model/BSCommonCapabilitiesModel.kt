package browser_stack.capabilities.model

data class BSCommonCapabilitiesModel(
    val project: String,
    val automationName: String,
    val acceptSslCerts: Boolean,
    val autoGrantPermissions: Boolean
)