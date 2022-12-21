package bellica.spiritualis.cookbook.models

data class Recipe(
    val id: Long,
    val title: String,
    val ingredients: List<Ingredient>,
    val description: String
)