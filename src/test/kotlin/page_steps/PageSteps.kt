package page_steps

import com.codeborne.selenide.WebDriverRunner
import io.appium.java_client.android.AndroidDriver

abstract class PageSteps {
    var driver = WebDriverRunner.getWebDriver() as AndroidDriver<*>
}