package page_object;

import element_finder.ElementFinder
import org.openqa.selenium.By


class ContactsPage {
        val callButton = ElementFinder.find(By.id("contacts_btn_call"))
}
