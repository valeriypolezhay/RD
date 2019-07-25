package tests.regression

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.Selenide.sleep
import element_finder.ElementFinder
import org.openqa.selenium.By
import org.testng.annotations.Parameters
import org.testng.annotations.Test
import tests.BaseTest

class LoginTest: BaseTest(){

    @Test
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun loginTest(driverName: String, deviceName: String, screenOrientation: String){
        Selenide.sleep(2000)
        ElementFinder.find(By.id("actionButton")).click()
        ElementFinder.find(By.id("loginButton")).click()
        ElementFinder.find(By.id("loginEditText")).sendKeys("valeriypolezhay@gmail.com")
        sleep(1000)
        ElementFinder.find(By.id("passwordEditText")).sendKeys("PLANETAKINO_password")
        ElementFinder.find(By.id("loginButton")).click()

        ElementFinder.find(By.id("menuButton")).click()
        val bonus=ElementFinder.find(By.id("nav_header_bonuses_value")).text()

        check(bonus.contains("375"))

    }
}