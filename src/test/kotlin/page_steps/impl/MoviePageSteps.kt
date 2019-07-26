package page_steps.impl

import org.testng.Assert.assertEquals
import page_object.MoviePage
import page_steps.PageSteps

class MoviePageSteps() : PageSteps() {

    fun checkName(movieName: String):MoviePageSteps {

      assertEquals ((MoviePage().name),movieName)

        return this
    }
}