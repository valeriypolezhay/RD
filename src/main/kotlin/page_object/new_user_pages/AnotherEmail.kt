package page_object.new_user_pages

import com.codeborne.selenide.Condition
import element_finder.ElementFinder
import org.openqa.selenium.By


class AnotherEmail() {

    fun clickToAddAnotherEmail() = ElementFinder.find(By.id("setup_addresses_add_another")).click()
    fun clickToOwner() = ElementFinder.find(By.id("action_done")).click()
}