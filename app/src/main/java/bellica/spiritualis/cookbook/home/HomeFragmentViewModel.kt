package bellica.spiritualis.cookbook.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bellica.spiritualis.cookbook.core.BaseViewModel
import bellica.spiritualis.cookbook.models.Ingredient
import bellica.spiritualis.cookbook.models.Recipe

class HomeFragmentViewModel(
    application: Application
) : BaseViewModel(application) {

    val recipes = MediatorLiveData<List<Recipe>>()

    fun getrecipes() {
        recipes.addSource(repository.getAll()) {
            recipes.value = it
        }
    }
}