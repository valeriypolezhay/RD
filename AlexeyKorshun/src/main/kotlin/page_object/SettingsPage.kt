package page_object

import element_finder.ElementFinder.Companion.find
import org.openqa.selenium.By

class SettingsPage : Page() {
    val appVersion = find(By.id("text_version"))
}