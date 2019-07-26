package tests.regression

import org.testng.annotations.Parameters
import org.testng.annotations.Test
import page_steps.impl.AuthorizeSteps
import tests.BaseTest

class UnsubscribeTest : BaseTest() {

    @Test
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun loginTest(driverName: String, deviceName: String, screenOrientation: String) {

        AuthorizeSteps()
            .startNewUse()
            .loginUser()
            .enterLogin("valeriypolezhay@gmail.com")
            .enterPassword("PLANETAKINO_password")
            .finalLogin()
            .openBurgerMenu()
            .clickPushSettings()
            .unsubscribe()
    }
}