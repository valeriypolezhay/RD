package page_steps.impl

import com.codeborne.selenide.Condition
import page_object.SettingsPage
import page_steps.PageSteps
import touch_actions.Swipes

class SettingsPageSteps : PageSteps() {
    private val settingsPage = SettingsPage()

    fun checkAppVersionInfo(expectedResult: String): SettingsPageSteps {
        settingsPage.appVersion.should(Condition.exactText(expectedResult))
        return this
    }

    override fun swipeToRight(): SettingsPageSteps {
        Swipes.swipeRight(driver)
        return this
    }

    override fun swipeToLeft(): SettingsPageSteps {
        Swipes.swipeLeft(driver)
        return this
    }
}