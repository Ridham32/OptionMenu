package com.ridhamsharma.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Switch
import android.widget.Toast
import com.ridhamsharma.optionmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.bartool)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optonmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.optProfile-> Toast.makeText(this,"Clicked Profile",Toast.LENGTH_SHORT).show()

            R.id.optSettings-> Toast.makeText(this,"Clicked Settings",Toast.LENGTH_SHORT).show()

            R.id.optlogout-> Toast.makeText(this,"Clicked LogOut",Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)
    }
}