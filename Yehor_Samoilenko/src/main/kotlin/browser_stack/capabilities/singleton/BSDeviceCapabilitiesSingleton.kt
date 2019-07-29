package browser_stack.capabilities.singleton

import browser_stack.capabilities.model.BSDeviceCapabilitiesModel
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import global_variables.Paths.Companion.BS_CAPABILITIES_JSON
import java.io.File

object BSDeviceCapabilitiesSingleton {

    val deviceCapabilities = getCapabilities()

    /**
     * Get list of available capabilities form json
     * @return - List of BrowserStack capability models
     */
    private fun getCapabilities(): List<BSDeviceCapabilitiesModel> {

        val mapper = jacksonObjectMapper()
        val file = File(BS_CAPABILITIES_JSON)
        val generalNode: JsonNode = mapper.readTree(file).path("deviceCapabilities")
        return mapper.readValue(generalNode.toString())
    }
}