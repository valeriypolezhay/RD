package tests.regression

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.sleep
import com.codeborne.selenide.SelenideElement
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.annotations.Parameters
import org.testng.annotations.Test
import tests.BaseTest
import org.openqa.selenium.By
import org.openqa.selenium.Point
import touch_actions.Swipes.Companion.swipe

class HomePage : BaseTest() {

    @Test
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun test(driverName: String, deviceName: String, screenOrientation: String) {
//        setDriver(driverName, deviceName, screenOrientation)

//        val b: SelenideElement = `$`(By.id("roll_button"))
//        b.shouldBe(Condition.visible)
//        b.click()
//        sleep(1000)
//        b.click()
//        sleep(1000)
//        b.click()
//        sleep(1000)
//        b.click()
        /////////////

//        val b: SelenideElement = `$`(By.id("clock"))
//        b.shouldBe(Condition.visible).click()
//
//        swipe(, Point(500, 1200), Point(500, 800), 1000)


    }
}