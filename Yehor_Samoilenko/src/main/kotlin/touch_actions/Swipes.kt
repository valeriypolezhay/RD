package touch_actions

import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.touch.WaitOptions
import io.appium.java_client.touch.offset.PointOption
import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver
import java.time.Duration

class Swipes {

    companion object {

        fun swipeLeft(driver: AndroidDriver<*>) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)
            val leftPoint = getLeftPoint(driver)
            val rightPoint = getRightPoint(driver)
            driver.performTouchAction(touchActions)
                    .press(PointOption.point(leftPoint.x, leftPoint.y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(700)))
                    .moveTo(PointOption.point(rightPoint.x, rightPoint.y))
                    .release()
                    .perform()
        }

        fun swipeRight(driver: AndroidDriver<*>) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)
            val leftPoint = getLeftPoint(driver)
            val rightPoint = getRightPoint(driver)
            driver.performTouchAction(touchActions)
                    .press(PointOption.point(rightPoint.x, rightPoint.y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(700)))
                    .moveTo(PointOption.point(leftPoint.x, leftPoint.y))
                    .release()
                    .perform()
        }

        fun swipe(driver: AndroidDriver<*>, startPoint: Point, endPoint: Point, millis: Long){
            val touchActions: TouchAction<Nothing> = TouchAction(driver)
            driver.performTouchAction(touchActions)
                    .press(PointOption.point(startPoint.x, startPoint.y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(millis)))
                    .moveTo(PointOption.point(endPoint.x, endPoint.y))
                    .release()
                    .perform()
        }

        private fun getLeftPoint(driver: WebDriver): Point {
            return Point((driver.manage().window().size.width * 0.001).toInt(), (driver.manage().window().size.height * 0.5).toInt())
        }

        private fun getRightPoint(driver: WebDriver): Point {
            return Point((driver.manage().window().size.width * 0.97).toInt(), (driver.manage().window().size.height * 0.5).toInt())
        }


    }
}