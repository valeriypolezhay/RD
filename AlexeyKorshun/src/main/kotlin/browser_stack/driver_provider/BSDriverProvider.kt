package browser_stack.driver_provider

import browser_stack.capabilities.provider.BrowserStackCapabilitiesProvider
import browser_stack.config.singleton.BSCommonConfigSingleton
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL

class BSDriverProvider() {
    private val bsCommonConfig = BSCommonConfigSingleton.commonConfig

    /**
     * Creates driver for desired capabilityName
     * @capabilityName - name of capability for desired device
     * @screenOrientation - orientation of device screen.
     */
    fun getDriver(capabilityName: String, screenOrientation: String): WebDriver {
        //        TODO - done!
        val bsCapability = BrowserStackCapabilitiesProvider(capabilityName, screenOrientation).desiredCapabilities
        return RemoteWebDriver(URL(bsCommonConfig.protocol + bsCommonConfig.userName
                + bsCommonConfig.key + bsCommonConfig.hubUrl), bsCapability)
    }
}