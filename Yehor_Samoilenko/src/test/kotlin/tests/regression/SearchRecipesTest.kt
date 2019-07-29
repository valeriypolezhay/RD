package tests.regression;

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class SearchRecipesTest: BaseTest() {

    @Test
    fun checkSearch() {
        val searchText = "Кулич"

        HomePageSteps()
            .openRecipesPage()
            .search(searchText)
            .checkSearchForValidity(searchText)
    }
}
