package element_finder

import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import touch_actions.Scrolls
import java.time.LocalTime


class ElementFinder {

    companion object {

        fun find(bySelector: By): SelenideElement {
            return Selenide.`$`(bySelector)
        }

        fun findMany(bySelector: By): ElementsCollection {
            return Selenide.`$$`(bySelector)
        }

        fun findWithScroll(bySelector: By, timeOutInSeconds: Long = 25): SelenideElement {
            val timeOut = LocalTime.now().plusSeconds(timeOutInSeconds)

            while (!(find(bySelector).`is`(visible))) {
                Scrolls.scrollDown(WebDriverRunner.getWebDriver() as AndroidDriver<*>)
                if (LocalTime.now().isAfter(timeOut))
                    throw NoSuchElementException("No such element with $bySelector selector")
            }
            return Selenide.`$`(bySelector)
        }
    }
}

