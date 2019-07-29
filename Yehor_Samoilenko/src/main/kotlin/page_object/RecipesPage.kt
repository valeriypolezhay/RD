package page_object;

import element_finder.ElementFinder
import org.openqa.selenium.By;

class RecipesPage:Page() {

    // Полевая каша
    val fieldPporridgeSection = ElementFinder.findWithScroll(By.xpath("//android.widget.TextView[@text='Полевая каша']"))
    val searchField = ElementFinder.find(By.id("recipes_list_etv_search"))
}
