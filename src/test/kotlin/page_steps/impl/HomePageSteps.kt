package page_steps.impl

import com.codeborne.selenide.Selenide.sleep
import org.openqa.selenium.Point
import page_steps.PageSteps
import touch_actions.Swipes

class HomePageSteps : PageSteps() {

    fun customSwipe(): HomePageSteps {
        Swipes.swipeRight(driver)
        return HomePageSteps()
    }

    fun swipeButActuallyClick(): MoviePageSteps {
        sleep(1000)
        Swipes.swipe(driver, Point(500, 500), Point(500, 500), 100)
        return MoviePageSteps()
    }

}