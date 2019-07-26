package page_object

import element_finder.ElementFinder.Companion.find
import org.openqa.selenium.By

class HomePage : Page() {
    val nextButton = find(By.id("quick_tips_next_text"))

    val divButton = find(By.id("div"))
    val mulButton = find(By.id("mul"))
    val minusButton = find(By.id("minus"))
    val plusButton = find(By.id("plus"))
    val equalButton = find(By.id("equal"))

    val zeroButton = find(By.id("digit0"))
    val oneButton = find(By.id("digit1"))
    val twoButton = find(By.id("digit2"))
    val threeButton = find(By.id("digit3"))
    val fourButton = find(By.id("digit4"))
    val fiveButton = find(By.id("digit5"))
    val sixButton = find(By.id("digit6"))
    val sevenButton = find(By.id("digit7"))
    val eightButton = find(By.id("digit8"))
    val nineButton = find(By.id("digit9"))

    val resultWindow = find(By.id("display")).find(By.className("android.widget.TextView"))

    val unitButton = find(By.id("btn_trig_units"))
    val sinButton = find(By.id("custom_key_0"))
    val settingsButton = find(By.id("settings_btn"))
}