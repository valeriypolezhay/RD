package page_steps.impl

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.sleep
import page_object.AuthorizePage
import page_object.HomePage
import page_steps.PageSteps

class AuthorizeSteps : PageSteps() {

    private val authorizePage = AuthorizePage()

    fun startNewUse(): AuthorizeSteps {
        authorizePage.actionButton.should(Condition.exist).click()
        return AuthorizeSteps()
    }


    fun goNextAsNewUser(): AuthorizeSteps {
        authorizePage.iAmNewButton.click()
        return AuthorizeSteps()
    }

    fun registerLater(): HomePageSteps {
        authorizePage.skipButton.click()
        return HomePageSteps()
    }

    fun loginUser(): AuthorizeSteps {
        authorizePage.loginButton.click()
        return AuthorizeSteps()
    }

    fun enterLogin(login: String): AuthorizeSteps {
        authorizePage.loginField.sendKeys(login)
        return AuthorizeSteps()
    }

    fun enterPassword(password: String): AuthorizeSteps {
        authorizePage.passwordField.sendKeys(password)
        return AuthorizeSteps()
    }

    fun finalLogin(): HomePageSteps {
        authorizePage.loginButton.click()
        return HomePageSteps()
    }



}
