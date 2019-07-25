package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class AuthorizePage {

    val actionButton = ElementFinder.find(By.id("actionButton"))
    val registerButton = ElementFinder.find(By.id("registerButton"))
    val skipButton = ElementFinder.find(By.id("skipButton"))

}