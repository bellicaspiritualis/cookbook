package bellica.spiritualis.cookbook.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import bellica.spiritualis.cookbook.R
import bellica.spiritualis.cookbook.databinding.FragmentHomeBinding

class HomeFragment: Fragment() {

    private var _binding: FragmentHomeBinding? = null
    val binding get() = _binding!!

    private val viewModel: HomeFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

//        val view = inflater.inflate(R.layout.fragment_home, container,false)
//        val myTextView = view.findViewById<TextView>(R.id.my_text_view)
//        myTextView.text = viewModel.getText()
//        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initText()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initText() {
        binding.myTextView.text = viewModel.getText()
    }
}