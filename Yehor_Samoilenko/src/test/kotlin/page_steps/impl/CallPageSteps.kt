package page_steps.impl

import com.codeborne.selenide.Condition
import org.testng.Assert.assertTrue
import page_object.CallPage

class CallPageSteps {

    fun checkCallStarts(): CallPageSteps {
        assertTrue(CallPage().endCallButton.shouldBe(Condition.visible).isDisplayed)
        CallPage().endCallButton.click()
        return this
    }
}