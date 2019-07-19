package browser_stack.supplier_fileds

import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import java.io.File
import java.io.FileReader
import java.io.FileWriter

class BrowserStackSupplierFieldWriter {

    private val supplierFieldsFile: File = File("./src/main/resources/browserstack/browserstackFieldsSupplier.json")

    fun setFieldValueToJsonFile(fieldName: String, fieldValue: String) {
        val jsonObject: JSONObject = readFileAsJsonObject()
        jsonObject[fieldName] = fieldValue
        writeJsonToFile(jsonObject)
    }

    private fun readFileAsJsonObject(): JSONObject {
        val parser = JSONParser()
        return parser.parse(FileReader(supplierFieldsFile)) as JSONObject
    }

    private fun writeJsonToFile(json: JSONObject) {
        val writer = FileWriter(supplierFieldsFile.path)
        writer.write(json.toJSONString())
        writer.flush()
    }
}