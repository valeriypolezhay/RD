package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By


class CallPage {

    val endCallButton = ElementFinder.find(By.xpath("//android.widget.ImageButton[@content-desc='End call']"))
}