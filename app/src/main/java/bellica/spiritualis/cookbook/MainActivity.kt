package bellica.spiritualis.cookbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
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