package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class HomePage() {
    val menuButton=ElementFinder.find(By.id("menuButton"))
    val bonus=ElementFinder.find(By.id("nav_header_bonuses_value"))

    val setting= ElementFinder.find(By.id("nav_item_settings"))
}