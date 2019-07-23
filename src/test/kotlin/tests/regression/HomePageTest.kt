//package tests.regression
//
//import com.codeborne.selenide.Condition
//import com.codeborne.selenide.Selenide.`$`
//import com.codeborne.selenide.Selenide.sleep
//import com.codeborne.selenide.SelenideElement
//import com.codeborne.selenide.WebDriverRunner.getWebDriver
//import element_finder.ElementFinder
//import element_finder.Finder
//import io.appium.java_client.TouchAction
//import io.appium.java_client.android.AndroidDriver
//import io.appium.java_client.touch.WaitOptions
//import io.appium.java_client.touch.offset.PointOption
//import org.junit.Assert
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.WebElement
//import org.testng.annotations.Parameters
//import org.testng.annotations.Test
//import tests.BaseTest
//import org.openqa.selenium.By
//import org.openqa.selenium.Point
//import touch_actions.Scrolls
//import touch_actions.Swipes
//import touch_actions.Swipes.Companion.swipe
//import java.sql.DriverManager.getDriver
//import java.time.Duration
//
//class HomePageTest : BaseTest() {
//
//    @Test
//    @Parameters("driverName", "deviceName", "screenOrientation")
//    fun test(driverName: String, deviceName: String, screenOrientation: String) {
//
//        sleep(4000)
//
//        val driver = getWebDriver()
//
//        ElementFinder.find(By.id(""))
//
////        swipe(driver as AndroidDriver<*>,Point(500,1700),Point(500,1700),100)
//
//
//    }
//}