package page_steps.impl

import com.codeborne.selenide.Condition
import element_finder.ElementFinder.Companion.find
import org.openqa.selenium.By

class HomePageSteps {


    fun open(){
        find(By.id("")).shouldBe(Condition.visible)
    }
}