package tests

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.WebDriverRunner
import driver_factory.DriverFactory
import org.testng.annotations.*

abstract class BaseTest {

    @BeforeTest
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun setDriver(driverName: String, deviceName: String, screenOrientation: String) {
        val driver = DriverFactory().getDriver(driverName, deviceName, screenOrientation.toUpperCase())
        WebDriverRunner.setWebDriver(driver)
    }

    @AfterTest(alwaysRun = true)
    fun tearDown() {
        Selenide.close()
    }
}