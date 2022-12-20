package bellica.spiritualis.cookbook.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import bellica.spiritualis.cookbook.R

class HomeFragment: Fragment() {

    private val viewModel: HomeFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container,false)
        val myTextView = view.findViewById<TextView>(R.id.my_text_view)
        myTextView.text = viewModel.getText()
        return view
    }
}