package browser_stack.capabilities.singleton

import browser_stack.capabilities.model.BSDeviceCapabilitiesModel
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.jayway.jsonpath.Configuration
import com.jayway.jsonpath.JsonPath
import com.jayway.jsonpath.spi.json.GsonJsonProvider
import com.jayway.jsonpath.spi.json.JsonProvider
import global_variables.Paths
import java.io.File

object BSDeviceCapabilitiesSingleton {

    val deviceCapabilities = getCapabilities()

    /**
     * Get list of available capabilities form json
     * @return - List of BrowserStack capability models
     */
    private fun getCapabilities(): List<BSDeviceCapabilitiesModel> {
//        TODO("Add implementation - maybe done")

        val fullJsonString: String = File(Paths.BS_CAPABILITIES_JSON).readText()
        val conf = Configuration.builder().jsonProvider(GsonJsonProvider()).build()
        val browserStackJson: JsonObject = JsonPath.using(conf).parse(fullJsonString).read("$.deviceCapabilities")
        val bsDeviceCapability = browserStackJson.toString()

        return listOf(Gson().fromJson(bsDeviceCapability,BSDeviceCapabilitiesModel::class.java))
//        return (Gson().fromJson(bsDeviceCapability, listOf<BSDeviceCapabilitiesModel>()::class.java))
    }
}