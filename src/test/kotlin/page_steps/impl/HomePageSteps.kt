package page_steps.impl

import com.codeborne.selenide.Selenide.sleep
import junit.framework.Assert
import org.openqa.selenium.Point
import org.testng.Assert.assertTrue
import org.testng.AssertJUnit.assertEquals
import page_object.HomePage
import page_steps.PageSteps
import touch_actions.Swipes

class HomePageSteps : PageSteps() {

    val homePage = HomePage()

    fun customSwipe(): HomePageSteps {
        Swipes.swipeRight(driver)
        return this
    }

    fun swipeButActuallyClick(): MoviePageSteps {
        sleep(3000)
        Swipes.swipe(driver, Point(500, 500), Point(500, 500), 100)
        return MoviePageSteps()
    }

    fun openBurgerMenu(): HomePageSteps {
        homePage.menuButton.click()
        return this
    }

    fun checkBonusScore(bonuses: Int): HomePageSteps {
        assertTrue(homePage.bonus.text().contains(bonuses.toString()))
        return this
    }

    fun clickPushSettings(): PushSettingsPageSteps {
        homePage.setting.click()
        return PushSettingsPageSteps()
    }

}