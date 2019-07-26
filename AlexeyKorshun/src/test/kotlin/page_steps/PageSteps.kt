package page_steps

import com.codeborne.selenide.WebDriverRunner
import io.appium.java_client.android.AndroidDriver

abstract class PageSteps
{
    protected var driver = WebDriverRunner.getWebDriver() as AndroidDriver<*>

    abstract fun swipeToRight():PageSteps
    abstract fun swipeToLeft():PageSteps
}