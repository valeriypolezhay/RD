package tests.regression

import org.testng.annotations.Parameters
import org.testng.annotations.Test
import tests.BaseTest

class HomePage : BaseTest() {

    @Test
    @Parameters("driverName", "deviceName", "screenOrientation")
    fun test(driverName: String, deviceName: String, screenOrientation: String) {
        setDriver(driverName, deviceName, screenOrientation)
    }
}