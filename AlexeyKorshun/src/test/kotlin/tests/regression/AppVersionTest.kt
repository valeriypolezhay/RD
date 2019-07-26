package tests.regression

import org.testng.annotations.Test
import page_steps.impl.HomePageSteps
import tests.BaseTest

class AppVersionTest : BaseTest(){
    @Test
    fun checkAppVersionViaSettings() {
        HomePageSteps().clickOnNextButton()
                .clickOnNextButton()
                .clickOnNextButton()
                .swipeToLeft()
                .clickOnSettingsButton()
                .swipeToRight()
                .swipeToRight()
                .swipeToRight()
                .checkAppVersionInfo("Версия 3.8.0")
    }
}