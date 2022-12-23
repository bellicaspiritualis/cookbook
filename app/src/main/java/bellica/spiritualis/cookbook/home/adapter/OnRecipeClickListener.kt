package bellica.spiritualis.cookbook.home.adapter

import bellica.spiritualis.cookbook.models.Recipe

interface OnRecipeClickListener {

    fun onItemClick(item: Recipe)
}