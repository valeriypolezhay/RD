package page_steps.impl

import page_object.ContactsPage

class ContactsPageSteps {

    fun clickOnCallButton(): CallPageSteps {
        ContactsPage().callButton.click()
        return CallPageSteps()
    }
}