package touch_actions

import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption
import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver
import java.time.Duration

class Scrolls {


    companion object {

        fun scrollDown(driver: AndroidDriver<*>) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)
            val bottomPoint = getBottomPoint(driver)
            val topPoint = getTopPoint(driver)

            driver.performTouchAction(touchActions)
                    .press(PointOption.point(bottomPoint.x, bottomPoint.y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(topPoint.x, topPoint.y))
                    .release()
                    .perform()
        }

        fun scrollUp(driver: AndroidDriver<*>) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)
            val bottomPoint = getBottomPoint(driver)
            val topPoint = getTopPoint(driver)

            driver.performTouchAction(touchActions)
                    .press(PointOption.point(topPoint.x, topPoint.y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(bottomPoint.x, bottomPoint.y))
                    .release()
                    .perform()
        }

        fun fastScrollDown(driver: AndroidDriver<*>) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)
            val bottomPoint = getBottomPoint(driver)
            val topPoint = getTopPoint(driver)

            driver.performTouchAction(touchActions)
                    .press(PointOption.point(bottomPoint.x, bottomPoint.y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                    .moveTo(PointOption.point(topPoint.x, topPoint.y))
                    .release()
                    .perform()
        }

        fun fastScrollUp(driver: AndroidDriver<*>) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)
            val bottomPoint = getBottomPoint(driver)
            val topPoint = getTopPoint(driver)

            driver.performTouchAction(touchActions)
                    .press(PointOption.point(topPoint.x, topPoint.y))
                    .moveTo(PointOption.point(bottomPoint.x, bottomPoint.y))
                    .release()
                    .perform()
        }

        fun scroll(driver: AndroidDriver<*>, startPoint: Point, endPoint: Point, millis: Long) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)

            driver.performTouchAction(touchActions)
                    .press(PointOption.point(startPoint.x, startPoint.y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(millis)))
                    .moveTo(PointOption.point(endPoint.x, endPoint.y))
                    .release()
                    .perform()
        }

        private fun getBottomPoint(driver: WebDriver): Point {
            return Point((driver.manage().window().size.width * 0.5).toInt(), (driver.manage().window().size.height * 0.85).toInt())
        }

        private fun getTopPoint(driver: WebDriver): Point {
            return Point((driver.manage().window().size.width * 0.5).toInt(), (driver.manage().window().size.height * 0.30).toInt())
        }


    }


}