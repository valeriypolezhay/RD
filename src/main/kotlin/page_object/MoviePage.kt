package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class MoviePage() {
    val name= ElementFinder.find(By.id("originName"))
}