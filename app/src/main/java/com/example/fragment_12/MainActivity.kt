package com.example.fragment_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment_12.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, firstFragment)
            .commit()

        buttonFragment1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout, firstFragment)
                .addToBackStack(null)
                .commit()
        }

        buttonFragment2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout, secondFragment)
                .addToBackStack(null)
                .commit()
        }

    }
}