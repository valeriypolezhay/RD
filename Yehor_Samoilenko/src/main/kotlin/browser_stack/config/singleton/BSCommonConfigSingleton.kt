package browser_stack.config.singleton

import browser_stack.config.models.BSCommonConfigModel
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import global_variables.Paths
import java.io.File

object BSCommonConfigSingleton {

    val commonConfig = getConfigs()

    /**
     * Gets common config for BrowserStack from json
     * @return - BrowserStack common configuration model
     */
    private fun getConfigs(): BSCommonConfigModel {

        val mapper = jacksonObjectMapper()
        val file = File(Paths.BS_COMMON_CONFIG_JSON)

        val jsonNode: JsonNode = mapper.readTree(file).path("browserStack")

        return mapper.convertValue<BSCommonConfigModel>(jsonNode, BSCommonConfigModel::class.java)
    }

}