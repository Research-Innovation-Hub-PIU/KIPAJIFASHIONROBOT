package com.example.kipajifashionrobot.ui.theme

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kipajifashionrobot.R
import com.example.kipajifashionrobot.databinding.ActivityStylistspanelBinding

class Appexport

class stylistspanel(RootObject: Any) : AppCompatActivity() {

//    private var appBarConfiguration: Appexport? = any.also { null type RootObject = it };BarConfiguration
    private lateinit var binding: ActivityStylistspanelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStylistspanelBinding.inflate(layoutInflater)
        setContentView(binding.root)

    //    setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_stylistspanel)
     ///   appBarConfiguration = AppBarConfiguration(navController.graph)
      ///  setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    //override fun onSupportNavigateUp(): Boolean {
       /// val navController = findNavController(R.id.nav_host_fragment_content_stylistspanel)
      ////  return navController.navigateUp(appBarConfiguration)
      ///          || super.onSupportNavigateUp()
   ///// }
}