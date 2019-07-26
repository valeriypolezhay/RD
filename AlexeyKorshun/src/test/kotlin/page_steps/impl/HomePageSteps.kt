package page_steps.impl

import com.codeborne.selenide.Condition.exactText
import page_object.HomePage
import page_steps.PageSteps
import touch_actions.Scrolls.Companion.scrollDown
import touch_actions.Swipes.Companion.swipeLeft
import touch_actions.Swipes.Companion.swipeRight

class HomePageSteps : PageSteps() {
    private val homePage = HomePage()

    fun clickOnNextButton(): HomePageSteps {
        homePage.nextButton.click()
        return this
    }

    fun clickOnZeroButton(): HomePageSteps {
        homePage.zeroButton.click()
        return this
    }

    fun clickOnOneButton(): HomePageSteps {
        homePage.oneButton.click()
        return this
    }

    fun clickOnTwoButton(): HomePageSteps {
        homePage.twoButton.click()
        return this
    }

    fun clickOnThreeButton(): HomePageSteps {
        homePage.threeButton.click()
        return this
    }

    fun clickOnFourButton(): HomePageSteps {
        homePage.fourButton.click()
        return this
    }

    fun clickOnFiveButton(): HomePageSteps {
        homePage.fiveButton.click()
        return this
    }

    fun clickOnSixButton(): HomePageSteps {
        homePage.sixButton.click()
        return this
    }

    fun clickOnSevenButton(): HomePageSteps {
        homePage.sevenButton.click()
        return this
    }

    fun clickOnEightButton(): HomePageSteps {
        homePage.eightButton.click()
        return this
    }

    fun clickOnNineButton(): HomePageSteps {
        homePage.nineButton.click()
        return this
    }

    fun clickOnPlusButton(): HomePageSteps {
        homePage.plusButton.click()
        return this
    }

    fun clickOnMulButton(): HomePageSteps {
        homePage.mulButton.click()
        return this
    }

    fun clickOnDivButton(): HomePageSteps {
        homePage.divButton.click()
        return this
    }

    fun clickOnMinusButton(): HomePageSteps {
        homePage.minusButton.click()
        return this
    }

    fun clickOnEqualsButton(): HomePageSteps {
        homePage.equalButton.click()
        return this
    }

    fun clickOnSinButton(): HomePageSteps {
        homePage.sinButton.click()
        return this
    }

    fun checkResult(expectedResult: String): HomePageSteps {
        homePage.resultWindow.should(exactText(expectedResult))
        return this
    }

    fun scrollDown(): HomePageSteps {
        scrollDown(driver)
        return this
    }

    fun clickOnUnitButton(): HomePageSteps {
        homePage.unitButton.click()
        return this
    }

    override fun swipeToRight(): HomePageSteps {
        swipeRight(driver)
        return this
    }

    override fun swipeToLeft(): HomePageSteps {
        swipeLeft(driver)
        return this
    }

    fun clickOnSettingsButton(): SettingsPageSteps {
        homePage.settingsButton.click()
        return SettingsPageSteps()
    }
}