package bellica.spiritualis.cookbook.details

import android.app.Application
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import bellica.spiritualis.cookbook.core.BaseViewModel
import bellica.spiritualis.cookbook.models.Recipe
import kotlinx.coroutines.launch

class DetailsViewModel(
    application: Application
) : BaseViewModel(application) {

    val recipe = MediatorLiveData<Recipe>()

    fun onRecipeIdObtained(recipeId: Long) {
        recipe.addSource(repository.get(recipeId)) {
            recipe.value = it
        }
    }

    fun onDeleteClick() {
        viewModelScope.launch {
            recipe.value?.let {
                repository.delete(it.id)
            }
        }
    }
}