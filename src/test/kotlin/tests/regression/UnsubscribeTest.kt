package tests.regression

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.sleep
import element_finder.ElementFinder
import org.jsoup.Connection
import org.openqa.selenium.By
import org.testng.annotations.Parameters
import org.testng.annotations.Test
import tests.BaseTest

class UnsubscribeTest : BaseTest() {
    @Test
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun loginTest(driverName: String, deviceName: String, screenOrientation: String) {
        sleep(2000)
        ElementFinder.find(By.id("actionButton")).click()
        ElementFinder.find(By.id("loginButton")).click()
        ElementFinder.find(By.id("loginEditText")).sendKeys("valeriypolezhay@gmail.com")
        sleep(1000)
        ElementFinder.find(By.id("passwordEditText")).sendKeys("PLANETAKINO_password")
        ElementFinder.find(By.id("loginButton")).click()

        ElementFinder.find(By.id("menuButton")).click()

        ElementFinder.find(By.id("nav_item_settings")).click()
        sleep(10000)
        ElementFinder.findWithScroll(By.xpath("//android.widget.Button[@text='ВІДПИСАТИСЯ']")).click()


    }
}