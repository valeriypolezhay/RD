package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class RecipesItemPageProductsTabTests: BaseTest() {

    @Test
    fun checkGarlicFieldForValidity() {
        val validText = "2 головки"

        HomePageSteps()
            .openRecipesPage()
            .clickOnFieldPporridgeSection()
            .openProductsTab()
            .checkGarlicFieldForValidity(validText)
    }
}