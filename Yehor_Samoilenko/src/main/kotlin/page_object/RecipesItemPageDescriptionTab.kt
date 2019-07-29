package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class RecipesItemPageDescriptionTab:Page() {

    val productsTab = ElementFinder.find(By.id("recipes_detail_btn_products"))
}