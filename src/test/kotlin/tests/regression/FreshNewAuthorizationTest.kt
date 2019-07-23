package tests.regression

import com.codeborne.selenide.Selenide.sleep
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner
import io.appium.java_client.android.AndroidDriver
import org.testng.annotations.Test
import page_object.new_user_pages.AnotherEmail
import tests.BaseTest
import page_object.new_user_pages.WelcomePage
import touch_actions.Touches

class FreshNewAuthorizationTest() : BaseTest() {

    val driverRunner=WebDriverRunner()

    @Test
    fun gotIt() {

        WelcomePage().clickGotIt()
        AnotherEmail().clickToOwner()
        sleep(3000)
//        Touches.touch(driver as AndroidDriver<*>, Point(400,800))

    }

}