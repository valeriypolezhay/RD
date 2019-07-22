package browser_stack.config.singleton

import browser_stack.config.models.BSCommonConfigModel
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.google.gson.Gson
import com.google.gson.JsonObject
import global_variables.Paths.Companion.BS_COMMON_CONFIG_JSON

import java.io.File
import com.jayway.jsonpath.Configuration
import com.jayway.jsonpath.JsonPath
import com.jayway.jsonpath.spi.json.GsonJsonProvider


object BSCommonConfigSingleton {

    val commonConfig = getConfigs()

    /**
     * Gets common config for BrowserStack from json
     * @return - BrowserStack common configuration model
     */
    private fun getConfigs(): BSCommonConfigModel {
//        TODO("Add implementation - maybe done")

        val mapper = jacksonObjectMapper()
        val file = File(BS_COMMON_CONFIG_JSON)

        val generalNode: JsonNode = mapper.readTree(file).path("browserStack")
        return mapper.convertValue(generalNode, BSCommonConfigModel::class.java)
    }
}