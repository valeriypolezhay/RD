package page_steps.impl

import page_object.AuthorizePage
import page_object.Page
import page_steps.PageSteps

class AuthorizeSteps : PageSteps() {

    val home = AuthorizePage()

    fun startWithoutAccount() : HomePageSteps {
        home.actionButton.click()
        home.registerButton.click()
        home.skipButton.click()
        return HomePageSteps()
    }
}
