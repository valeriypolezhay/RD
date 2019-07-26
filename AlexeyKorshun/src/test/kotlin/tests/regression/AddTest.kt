package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class AddTest : BaseTest() {

    @Test
    fun sumOfPositiveBigNumbers() {
        HomePageSteps().clickOnNextButton()
                .clickOnNextButton()
                .clickOnNextButton()
                .clickOnSixButton()
                .clickOnZeroButton()
                .clickOnZeroButton()
                .clickOnZeroButton()
                .clickOnPlusButton()
                .clickOnSixButton()
                .clickOnZeroButton()
                .clickOnZeroButton()
                .clickOnZeroButton()
                .clickOnEqualsButton()
                .checkResult("12 000")
    }
}