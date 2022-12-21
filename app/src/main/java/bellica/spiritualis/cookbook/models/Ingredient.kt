package bellica.spiritualis.cookbook.models

data class Ingredient(
    val title: String,
    val amount: Double,
    val measureType: String? = null
)