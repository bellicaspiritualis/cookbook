package bellica.spiritualis.cookbook.core

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import bellica.spiritualis.cookbook.core.database.RecipeDatabase
import bellica.spiritualis.cookbook.core.database.RecipeRepository

open class BaseViewModel(
    application: Application
) : AndroidViewModel(application) {

    val database by lazy { RecipeDatabase.getInstance(application)}
    val repository by lazy {RecipeRepository(database.recipeDao())}
}