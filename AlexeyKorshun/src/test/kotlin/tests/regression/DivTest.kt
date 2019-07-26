package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class DivTest : BaseTest(){

    @Test
    fun divOfPositiveNumbers() {
        HomePageSteps().clickOnNextButton()
                .clickOnNextButton()
                .clickOnNextButton()
                .clickOnTwoButton()
                .clickOnEightButton()
                .clickOnDivButton()
                .clickOnFourButton()
                .clickOnEqualsButton()
                .checkResult("7")
    }
}