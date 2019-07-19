package browser_stack.config.singleton

import browser_stack.config.models.BSCommonConfigModel
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

        val fullJsonString: String = File(BS_COMMON_CONFIG_JSON).readText()
        val conf = Configuration.builder().jsonProvider(GsonJsonProvider()).build()
        val browserStackJson: JsonObject = JsonPath.using(conf).parse(fullJsonString).read("$.browserStack")
        val browserStackString = browserStackJson.toString()

        return Gson().fromJson(browserStackString, BSCommonConfigModel::class.java)


    }
}