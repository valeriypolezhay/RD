package element_finder

import com.codeborne.selenide.Condition.visible
import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.By
import org.openqa.selenium.Point
import touch_actions.Scrolls
import touch_actions.point_creator.PointCreator
import java.time.LocalTime

class Finder(
    var bottomPoint: Point = PointCreator.createPoint(0.5, 0.85),
    var topPoint: Point = PointCreator.createPoint(0.5, 0.30),
    var defaultTimeOutInSeconds: Long = 25,
    var scrollDuration: Long = 1000
) {

    fun find(bySelector: By): SelenideElement {
        return Selenide.`$`(bySelector)
    }

    fun findMany(bySelector: By): ElementsCollection {
        return Selenide.`$$`(bySelector)
    }

    fun findWithScroll(bySelector: By): SelenideElement {
        val timeOut = LocalTime.now().plusSeconds(defaultTimeOutInSeconds)

        while (!(find(bySelector).`is`(visible))) {
            Scrolls.scroll(WebDriverRunner.getWebDriver() as AndroidDriver<*>, bottomPoint, topPoint, scrollDuration)
            if (LocalTime.now().isAfter(timeOut))
                throw NoSuchElementException("No such element with $bySelector selector")
        }
        return Selenide.`$`(bySelector)
    }

}