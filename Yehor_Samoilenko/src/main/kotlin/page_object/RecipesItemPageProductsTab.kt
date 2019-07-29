package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class RecipesItemPageProductsTab:Page() {

    val garlicField = ElementFinder.findWithScroll(By.xpath("//android.widget.TextView[@text='2 головки']")) //chesnok
}