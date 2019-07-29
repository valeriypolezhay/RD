package page_steps.impl

import org.testng.Assert.assertTrue
import page_object.AfterSearchPage


class AfterSearchPageSteps {

    fun checkSearchForValidity(searchText: String): AfterSearchPageSteps {
        assertTrue(AfterSearchPage().kulich.text().contains(searchText))
        return this
    }
}