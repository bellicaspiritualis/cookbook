package bellica.spiritualis.cookbook.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import bellica.spiritualis.cookbook.databinding.FragmentAddBinding
import bellica.spiritualis.cookbook.databinding.ItemIngredientBinding

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
}