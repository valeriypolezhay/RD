package page_steps.impl

import org.hamcrest.Matchers.contains
import org.testng.Assert.assertEquals
import page_object.RecipesPage
import page_steps.PageSteps

class RecipesPageSteps {

    fun clickOnFieldPporridgeSection(): RecipesItemPageDescriptionTabSteps {
        RecipesPage().fieldPporridgeSection.click()
        return RecipesItemPageDescriptionTabSteps()
    }

    fun search(searchText: String): AfterSearchPageSteps {
        RecipesPage().searchField.sendKeys(searchText)
        return AfterSearchPageSteps()
    }

}