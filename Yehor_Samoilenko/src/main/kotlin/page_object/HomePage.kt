package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class HomePage {

    val recipesButton = ElementFinder.find(By.xpath("//android.widget.TextView[@text='Рецепты']"))
    val toolbar = ElementFinder.find(By.id("toolbar"))
    val contactsButton = ElementFinder.find(By.xpath("//android.widget.TextView[@text='Контакты']"))
}