package bellica.spiritualis.cookbook.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import bellica.spiritualis.cookbook.core.database.IngredientDatabaseConverter

@Entity
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    @TypeConverters(IngredientDatabaseConverter::class)
    val ingredients: List<Ingredient>,
    val description: String
)