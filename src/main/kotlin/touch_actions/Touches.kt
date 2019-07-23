package touch_actions

import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.touch.offset.PointOption
import org.openqa.selenium.Point

class Touches() {

    companion object {

        fun touch(driver: AndroidDriver<*>, tap: Point) {
            val touchActions: TouchAction<Nothing> = TouchAction(driver)

            driver.performTouchAction(touchActions)
                .press(PointOption.point(tap.x, tap.y))

        }
    }
}