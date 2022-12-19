package bellica.spiritualis.cookbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lifecycle_check", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle_check", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle_check", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecycle_check", "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle_check", "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle_check", "onStop")
    }
}