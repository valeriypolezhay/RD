package browser_stack.capabilities.singleton

import browser_stack.capabilities.model.BSCommonCapabilitiesModel
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
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

        val mapper = jacksonObjectMapper()
        val file = File(Paths.BS_CAPABILITIES_JSON)

        val generalNode: JsonNode = mapper.readTree(file).path("commonCapabilities")
        return mapper.convertValue(generalNode, BSCommonCapabilitiesModel::class.java)

    }
}