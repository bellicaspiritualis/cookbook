package bellica.spiritualis.cookbook.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import bellica.spiritualis.cookbook.R
import bellica.spiritualis.cookbook.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment()
    }

    private fun addFragment() {
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, HomeFragment()).commit()
        Log.d("lifecycle_check", "addFragment")
    }
}