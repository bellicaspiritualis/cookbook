package bellica.spiritualis.cookbook.home.adapter

import androidx.recyclerview.widget.RecyclerView
import bellica.spiritualis.cookbook.databinding.ItemRecipeBinding
import bellica.spiritualis.cookbook.models.Recipe

class RecipesViewHolder(
    private val binding: ItemRecipeBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(recipe: Recipe, listener: OnRecipeClickListener) {
        with(recipe) {
            binding.title.text = title
            binding.title.setOnClickListener {
                listener.onItemClick(recipe)
            }
        }
    }
}