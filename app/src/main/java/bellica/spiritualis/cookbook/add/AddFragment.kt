package bellica.spiritualis.cookbook.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import bellica.spiritualis.cookbook.databinding.FragmentAddBinding
import bellica.spiritualis.cookbook.databinding.ItemIngredientBinding
import bellica.spiritualis.cookbook.models.Ingredient
import bellica.spiritualis.cookbook.models.Recipe

class AddFragment: Fragment() {

    private var _binding: FragmentAddBinding? = null
    val binding get() = _binding!!

    private val viewModel: AddFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickListeners()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initClickListeners() {
        binding.saveButton.setOnClickListener {
            val recipe = getRecipes()
            findNavController().popBackStack()
        }

        binding.addIngredientButton.setOnClickListener {
            addIngredient()
        }
    }

    private fun addIngredient() {
        val container = binding.ingredientsContainer
        val ingredientItem = ItemIngredientBinding.inflate(layoutInflater, container, false)
        container.addView(ingredientItem.root)
    }

    private fun getRecipes() = Recipe(
        id = 0L,
        title = binding.title.text.toString(),
        ingredients = getIngredients(),
        description = binding.description.text.toString()
    )

    private fun getIngredients(): List<Ingredient> {
        val ingredientsChildren = binding.ingredientsContainer.children
        val ingredients = mutableListOf<Ingredient>()

        for(ingredientView in ingredientsChildren) {
            val ingredientBinding = ItemIngredientBinding.bind(ingredientView)
            val ingredient = with(ingredientBinding) {
                Ingredient(
                    title = name.text.toString(),
                    amount = amount.text.toString().replace(",", ".").toDouble(),
                    measureType = unit.text.toString()
                )
            }
            ingredients.add(ingredient)
        }

        return ingredients
    }
}