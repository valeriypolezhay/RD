package page_steps.impl

import org.testng.Assert.assertEquals
import page_object.RecipesItemPageProductsTab
import page_steps.PageSteps

class RecipesItemPageProductsTabSteps {

        fun checkGarlicFieldForValidity(validText: String): RecipesItemPageProductsTabSteps {
        assertEquals(RecipesItemPageProductsTab().garlicField.text(),validText)
        return this
    }
}