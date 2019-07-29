package page_steps.impl

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement
import com.codeborne.selenide.commands.Exists
import org.testng.Assert.assertEquals
import page_object.MoviePage
import page_steps.PageSteps

class MoviePageSteps() : PageSteps() {

    fun checkName(movieName: String): MoviePageSteps {
        val s: SelenideElement = MoviePage().name
        s.shouldBe(Condition.exist)
        assertEquals(s.text(), movieName)

        return this
    }
}