package page_steps.impl


import org.junit.Assert
import org.testng.Assert.assertEquals
import org.testng.Assert.assertTrue
import page_object.MoviePage
import page_steps.PageSteps

class MoviePageSteps() : PageSteps() {

    fun checkName(movieName: String):MoviePageSteps {

//      assertTrue ((MoviePage().name).contains(movieName))
      assertEquals ((MoviePage().name),movieName)

        return this
    }
}