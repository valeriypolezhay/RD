package browser_stack.supplier_fileds

import browser_stack.supplier_fileds.models.BrowserStackSupplierFields
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.File

class BrowserStackSupplierFieldsProvider {

    private val supplierFieldsNode: JsonNode

    val supplierFields: BrowserStackSupplierFields

    init {
        val mapper = jacksonObjectMapper()
        val supplierFieldsFile = File("./src/main/resources/browserstack/browserstackFieldsSupplier.json")

        supplierFieldsNode = mapper.readTree(supplierFieldsFile)

        supplierFields = mapper.convertValue<BrowserStackSupplierFields>(supplierFieldsNode, BrowserStackSupplierFields::class.java)
    }
}