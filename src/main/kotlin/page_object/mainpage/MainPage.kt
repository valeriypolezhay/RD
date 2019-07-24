package page_object.mainpage

import element_finder.ElementFinder
import org.openqa.selenium.By

class MainPage {

    fun createNewMessage() = ElementFinder.find(By.id("compose_button")).click()

}