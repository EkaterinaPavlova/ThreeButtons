package com.hfad.threebuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.threebuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun textOne(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)
        val text = "text_one"
        intent.putExtra(TEXT_ONE, text)
        startActivity(intent)
    }

    fun textTwo(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)
        val text = "text_two"
        intent.putExtra(TEXT_TWO, text)
        startActivity(intent)

    }

    fun textThree(view: android.view.View) {
        val intent = Intent(this, SecondActivity::class.java)
        val text = "text_three"
        intent.putExtra(TEXT_THREE, text)
        startActivity(intent)

    }

    companion object {
        const val TEXT_ONE = "button_one"
        const val TEXT_TWO = "button_two"
        const val TEXT_THREE = "button_three"

    }
}