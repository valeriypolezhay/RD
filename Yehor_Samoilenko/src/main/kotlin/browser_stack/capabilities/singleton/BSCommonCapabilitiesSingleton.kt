package browser_stack.capabilities.singleton

import browser_stack.capabilities.model.BSCommonCapabilitiesModel
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import global_variables.Paths.Companion.BS_CAPABILITIES_JSON
import java.io.File

object BSCommonCapabilitiesSingleton {

    val commonCapabilities = getCapabilities()

    /**
     * Gets common capabilities form json
     * @return - Common capabilities model
     */
    private fun getCapabilities(): BSCommonCapabilitiesModel {

        val mapper = jacksonObjectMapper()
        val file = File(BS_CAPABILITIES_JSON)

        val jsonNode: JsonNode = mapper.readTree(file).path("commonCapabilities")

        return mapper.convertValue<BSCommonCapabilitiesModel>(jsonNode, BSCommonCapabilitiesModel::class.java)
    }
}