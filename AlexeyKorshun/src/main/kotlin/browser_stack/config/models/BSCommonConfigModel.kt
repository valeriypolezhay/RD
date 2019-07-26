package browser_stack.config.models

data class BSCommonConfigModel(
    val server: String,
    val userName: String,
    val key: String,
    val appAutomateUrl: String,
    val appPath: String,
    val protocol: String,
    val hubUrl: String
)