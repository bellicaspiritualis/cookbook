package bellica.spiritualis.cookbook.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bellica.spiritualis.cookbook.models.Ingredient
import bellica.spiritualis.cookbook.models.Recipe

class HomeFragmentViewModel: ViewModel() {

    private val _recipes = MutableLiveData<List<Recipe>>()
    val recipes: LiveData<List<Recipe>> = _recipes

    init {
        _recipes.value = getRecipes()
    }

    fun getRecipes(): List<Recipe> {
        val ingredient1 = Ingredient(title = "all-purpose flour", 250.0, "g")
        val ingredient2 = Ingredient(title = "baking soda", 1.0, "teaspoon")
        val ingredient3 = Ingredient(title = "salt", 0.25, "teaspoon")
        val recipe1 = Recipe(
            id = 0,
            title = "Test przepis",
            listOf(ingredient1, ingredient2, ingredient3),
            description = "opis opis opis"
        )

        return listOf(recipe1)
    }
}