package browser_stack.driver_provider

import browser_stack.capabilities.provider.BrowserStackCapabilitiesProvider
import browser_stack.config.models.BSCommonConfigModel
import browser_stack.config.singleton.BSCommonConfigSingleton
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

        val specConfiguration = "https://" +
                BSCommonConfigSingleton.commonConfig.userName +
                ":" +
                BSCommonConfigSingleton.commonConfig.key +
                "@hub.browserstack.com/wd/hub"

        return RemoteWebDriver(URL(specConfiguration), bsCapability)

    }
}