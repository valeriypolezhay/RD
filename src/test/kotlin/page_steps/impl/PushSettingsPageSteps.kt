package page_steps.impl

import page_object.PushSettingsPage

class PushSettingsPageSteps {

    fun unsubscribe() {
        PushSettingsPage().unsubscribeButton.click()
    }
}