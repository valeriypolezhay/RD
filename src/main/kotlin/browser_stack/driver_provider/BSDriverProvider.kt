package browser_stack.driver_provider

import browser_stack.capabilities.provider.BrowserStackCapabilitiesProvider
import com.codeborne.selenide.SelenideElement
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL

class BSDriverProvider() {

    /**
     * Creates driver for desired capabilityName
     * @capabilityName - name of capability for desired device
     * @screenOrientation - orientation of device screen.
     */
    fun getDriver(capabilityName: String, screenOrientation: String): WebDriver {
//        TODO("Add implementation - maybe done")

        val bsCapability = BrowserStackCapabilitiesProvider(capabilityName, screenOrientation).desiredCapabilities
        return RemoteWebDriver(URL("https://valerii39:nymRAPPKeUwsGy1d1yNF@hub.browserstack.com/wd/hub"), bsCapability)

    }
}