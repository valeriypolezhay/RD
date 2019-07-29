package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class CallTest: BaseTest() {

    @Test
    fun checkCall() {
        HomePageSteps()
            .openContactsPage()
            .clickOnCallButton()
            .checkCallStarts()
    }
}