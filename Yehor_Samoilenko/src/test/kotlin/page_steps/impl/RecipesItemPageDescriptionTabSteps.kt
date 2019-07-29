package page_steps.impl

import page_object.RecipesItemPageDescriptionTab
import page_steps.PageSteps

class RecipesItemPageDescriptionTabSteps {

    fun openProductsTab(): RecipesItemPageProductsTabSteps {
        RecipesItemPageDescriptionTab().productsTab.click()
        return RecipesItemPageProductsTabSteps()
    }

}