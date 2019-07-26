package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class SinTest: BaseTest(){

    @Test
    fun sumOfPositiveBigNumbers() {
        HomePageSteps().clickOnNextButton()
                .clickOnNextButton()
                .clickOnNextButton()
                .scrollDown()
                .clickOnSinButton()
                .clickOnNineButton()
                .clickOnZeroButton()
                .clickOnUnitButton()
                .clickOnEqualsButton()
                .checkResult("1")
    }
}