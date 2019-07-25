package tests.regression

import com.codeborne.selenide.Selenide.sleep
import org.testng.annotations.Parameters
import org.testng.annotations.Test

import tests.BaseTest
import page_steps.impl.AuthorizeSteps

class AuthorizeTest : BaseTest() {

    @Test
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun test(driverName: String, deviceName: String, screenOrientation: String) {

//Todo - wtf with sleep
        sleep(2000)

        AuthorizeSteps()
            .startWithoutAccount()
            .customSwipe()
            .swipeButActuallyClick()
            .checkName("The Lion King")
    }
}