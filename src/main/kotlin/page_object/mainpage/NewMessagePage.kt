package page_object.mainpage

import com.codeborne.selenide.Selenide
import element_finder.ElementFinder
import org.openqa.selenium.By
import org.openqa.selenium.Keys

class NewMessagePage {

    fun sendMessage(sendTo: String, subject: String="", message: String="") {

        ElementFinder.find(By.id("to")).sendKeys(sendTo, Keys.TAB)
        ElementFinder.find(By.id("subject")).sendKeys(subject, Keys.TAB)

//        ElementFinder.find(By.id("wc_body")).click()
//        ElementFinder.find(By.id("composearea_tap_trap_bottom")).sendKeys(message)

        val m = Selenide.switchTo().activeElement()
        m.sendKeys(message)

        ElementFinder.find(By.id("send")).click()
    }


}
