package page_object

import element_finder.ElementFinder
import org.openqa.selenium.By

class PushSettingsPage {

    val unsubscribeButton = ElementFinder.findWithScroll(By.xpath("//android.widget.Button[@text='ВІДПИСАТИСЯ']"))
}