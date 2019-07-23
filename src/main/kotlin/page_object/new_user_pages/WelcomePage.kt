package page_object.new_user_pages

import com.codeborne.selenide.Condition
import element_finder.ElementFinder
import org.openqa.selenium.By

class WelcomePage() {

    fun clickGotIt() = ElementFinder.find(By.id("welcome_tour_got_it")).shouldBe(Condition.visible).click()

}