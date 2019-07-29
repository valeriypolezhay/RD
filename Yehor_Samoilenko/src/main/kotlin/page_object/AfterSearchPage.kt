package page_object;

import element_finder.ElementFinder
import org.openqa.selenium.By


class AfterSearchPage {

    val kulich = ElementFinder.find(By.xpath("//android.widget.TextView[@text='Кулич Пасхальный']"))
}
