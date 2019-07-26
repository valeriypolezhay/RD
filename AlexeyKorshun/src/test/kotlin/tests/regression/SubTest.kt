package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class SubTest :BaseTest(){

    @Test
    fun subOfPositiveNumbers() {
        HomePageSteps().clickOnNextButton()
                .clickOnNextButton()
                .clickOnNextButton()
                .clickOnOneButton()
                .clickOnThreeButton()
                .clickOnNineButton()
                .clickOnMinusButton()
                .clickOnSevenButton()
                .clickOnEqualsButton()
                .checkResult("132")
    }
}