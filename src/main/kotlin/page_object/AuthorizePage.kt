package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class AuthorizePage {

    val actionButton = ElementFinder.find(By.id("actionButton"))
    val iAmNewButton = ElementFinder.find(By.id("registerButton"))
    val skipButton = ElementFinder.find(By.id("skipButton"))
    val loginField= ElementFinder.find(By.id("loginEditText"))
    val passwordField= ElementFinder.find(By.id("passwordEditText"))
    val loginButton= ElementFinder.find(By.id("loginButton"))

}