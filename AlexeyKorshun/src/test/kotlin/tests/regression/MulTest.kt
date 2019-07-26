package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class MulTest : BaseTest(){

    @Test
    fun mulOfPositiveNumbers() {
        HomePageSteps().clickOnNextButton()
                .clickOnNextButton()
                .clickOnNextButton()
                .clickOnFiveButton()
                .clickOnMulButton()
                .clickOnTwoButton()
                .clickOnEqualsButton()
                .checkResult("10")
    }
}