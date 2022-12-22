package bellica.spiritualis.cookbook.core.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import bellica.spiritualis.cookbook.models.Recipe

@Database(
    entities = [
        Recipe::class
    ],
    version = 1,
    exportSchema = false
)

@TypeConverters(
    IngredientDatabaseConverter::class
)

abstract class RecipeDatabase : RoomDatabase() {

    companion object {
        private const val DATABASE_NAME = "cookbook.db"
        private const val DATABASE_DIR = "database/cookbook_db.db"

        fun getInstance(applicationContext: Context) = Room
            .databaseBuilder(applicationContext, RecipeDatabase::class.java, DATABASE_NAME)
            .createFromAsset(DATABASE_DIR)
            .build()
    }

    abstract fun recipeDao(): RecipeDao
}