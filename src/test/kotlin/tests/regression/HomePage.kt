package tests.regression

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.sleep
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner.getWebDriver
import io.appium.java_client.android.AndroidDriver
import org.junit.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.annotations.Parameters
import org.testng.annotations.Test
import tests.BaseTest
import org.openqa.selenium.By
import org.openqa.selenium.Point
import touch_actions.Scrolls
import touch_actions.Swipes.Companion.swipe

class HomePage : BaseTest() {

    @Test
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun test(driverName: String, deviceName: String, screenOrientation: String) {

        sleep(1000)
//        `$`(By.id("avatarView")).click()
        val driver = getWebDriver()
//        swipe(driver as AndroidDriver<*>, Point(500, 1200), Point(500, 800), 100)
//        Scrolls.fastScrollUp(driver as AndroidDriver<*>)

        val searchField = `$`(By.id("search_src_text"))
        searchField.click()
        searchField.value = "Nativus"


        `$`(By.id("userNameTextView")).shouldBe(Condition.visible).click()

        val profileDescription = `$`(By.id("descriptionTextView"))
        Assert.assertEquals(profileDescription, "typical geek")
        sleep(2000)

    }
}