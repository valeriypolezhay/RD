package browser_stack.capabilities.singleton

import browser_stack.capabilities.model.BSCommonCapabilitiesModel
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.jayway.jsonpath.Configuration
import com.jayway.jsonpath.JsonPath
import com.jayway.jsonpath.spi.json.GsonJsonProvider
import global_variables.Paths
import java.io.File

object BSCommonCapabilitiesSingleton {

    val commonCapabilities = getCapabilities()

    /**
     * Gets common capabilities form json
     * @return - Common capabilities model
     */
    private fun getCapabilities(): BSCommonCapabilitiesModel {
//        TODO("Add implementation - maybe done")

        val fullJsonString: String = File(Paths.BS_CAPABILITIES_JSON).readText()
        val conf = Configuration.builder().jsonProvider(GsonJsonProvider()).build()
        val browserStackJson: JsonObject = JsonPath.using(conf).parse(fullJsonString).read("$.commonCapabilities")
        val bsCommonCapability = browserStackJson.toString()

        return Gson().fromJson(bsCommonCapability, BSCommonCapabilitiesModel::class.java)
    }
}