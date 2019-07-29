package page_steps.impl

import com.codeborne.selenide.Condition
import com.codeborne.selenide.WebDriverRunner
import io.appium.java_client.android.AndroidDriver
import page_object.HomePage
import touch_actions.Swipes

class HomePageSteps {

    fun openRecipesPage(): RecipesPageSteps {
        HomePage().toolbar.shouldBe(Condition.visible)
        Swipes.swipeLeft(WebDriverRunner.getWebDriver() as AndroidDriver<*>)
        HomePage().recipesButton.click()
        return RecipesPageSteps()
    }

    fun  openContactsPage(): ContactsPageSteps {
        HomePage().toolbar.shouldBe(Condition.visible)
        Swipes.swipeLeft(WebDriverRunner.getWebDriver() as AndroidDriver<*>)
        HomePage().contactsButton.click()
        return ContactsPageSteps()
    }
}