package page_object.new_user_pages

import element_finder.ElementFinder
import org.openqa.selenium.By

class EmailTypes() {

    fun chooseGoogleEmail() = ElementFinder.find(
        By.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                    "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                    "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/" +
                    "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
                    "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/" +
                    "android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"
        )).click()

}