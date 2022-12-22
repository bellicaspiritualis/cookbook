package bellica.spiritualis.cookbook.add

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bellica.spiritualis.cookbook.core.BaseViewModel
import bellica.spiritualis.cookbook.models.Recipe
import kotlinx.coroutines.launch

class AddFragmentViewModel(
    application: Application
) : BaseViewModel(application) {

    fun onSaveClick(recipe: Recipe) {
        viewModelScope.launch {
            repository.add(recipe)
        }
    }
}