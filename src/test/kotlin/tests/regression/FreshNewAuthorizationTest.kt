package tests.regression

import com.codeborne.selenide.Selenide.sleep
import com.codeborne.selenide.WebDriverRunner
import org.testng.annotations.Test
import page_object.mainpage.MainPage
import page_object.mainpage.NewMessagePage
import page_object.new_user_pages.AnotherEmail
import tests.BaseTest
import page_object.new_user_pages.WelcomePage

class FreshNewAuthorizationTest() : BaseTest() {

//    val driverRunner = WebDriverRunner()

    @Test
    fun gotIt() {

        val to = "testaqamobile@mailinator.com"
        val subject = "AQA test"
        val message =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."

        WelcomePage().clickGotIt()
        AnotherEmail().clickToOwner()

        MainPage().createNewMessage()
        NewMessagePage().sendMessage(to, subject, message)


    }
//        Touches.touch(driver as AndroidDriver<*>, Point(400,800))
}