package touch_actions.point_creator

import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.WebDriverRunner
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.Point

class PointCreator {

    companion object {

        fun createPoint(widthCoefficient: Double, heightCoefficient: Double): Point {
            return Point((getScreenWidth() * widthCoefficient).toInt(),
                    (getScreenHeight() * heightCoefficient).toInt())
        }

        private fun getElementWidth(element: SelenideElement): Int {
            return element.size.width
        }

        private fun getElementHeight(element: SelenideElement): Int {
            return element.size.height
        }

        private fun getScreenWidth(): Double {
            return (WebDriverRunner.getWebDriver() as AndroidDriver<*>).manage().window().size.width.toDouble()
        }

        private fun getScreenHeight(): Double {
            return (WebDriverRunner.getWebDriver() as AndroidDriver<*>).manage().window().size.height.toDouble()
        }

        private fun getWidthCoefficientOnThePage(element: SelenideElement): Double {
            val elementWidth = getElementWidth(element).toDouble()
            val screenWidth = getScreenWidth()
            return elementWidth.div(screenWidth)
        }

        private fun getHeightCoefficientOnThePage(element: SelenideElement): Double {
            val elementHeight = getElementHeight(element).toDouble()
            val screenHeight = getScreenHeight()
            return elementHeight.div(screenHeight)
        }

        /**
         * Method create point the right of element
         *
         * @param element - selenide element
         * @param coefficientDistance - distance coefficient, between element and point, coefficient range(0,1)
         */
        fun pointRightOfElement(element: SelenideElement, coefficientDistance: Double): Point {
            return createPoint(
                getWidthCoefficientOnThePage(
                    element
                ) + coefficientDistance, 0.5
            )
        }

        fun pointBottomOfElement(element: SelenideElement, coefficientDistance: Double): Point{
            return createPoint(
                0.5,
                getHeightCoefficientOnThePage(element) + coefficientDistance
            )
        }

        fun getTopLeftPointInsideElement(element: SelenideElement): Point {
            val widthCoefficient = element.location.getX().div(getScreenWidth())
            val heightCoefficient = element.location.getY().div(getScreenHeight())
            return createPoint(
                widthCoefficient.plus(0.05),
                heightCoefficient.plus(0.05)
            )
        }

        fun getTopRightPointInsideElement(element: SelenideElement): Point {
            val elementWidth = getElementWidth(element)
            val widthCoefficient = (element.location.getX().plus(elementWidth)).div(getScreenWidth())
            val heightCoefficient = element.location.getY().div(getScreenHeight())
            return createPoint(
                widthCoefficient.minus(0.05),
                heightCoefficient.plus(0.05)
            )
        }

        fun getBottomLeftPointInsideElement(element: SelenideElement): Point {
            val elementHeight = getElementHeight(element)
            val widthCoefficient = element.location.getX().div(getScreenWidth())
            val heightCoefficient = (element.location.getY().plus(elementHeight)).div(getScreenHeight())
            return createPoint(
                widthCoefficient.plus(0.05),
                heightCoefficient.minus(0.05)
            )
        }

        fun getBottomRightPointInsideElement(element: SelenideElement): Point {
            val elementWidth = getElementWidth(element)
            val elementHeight = getElementHeight(element)
            val widthCoefficient = (element.location.getX().plus(elementWidth)).div(getScreenWidth())
            val heightCoefficient = (element.location.getY().plus(elementHeight)).div(getScreenHeight())
            return createPoint(
                widthCoefficient.minus(0.05),
                heightCoefficient.minus(0.05)
            )
        }
    }
}