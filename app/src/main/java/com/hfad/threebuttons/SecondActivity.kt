package com.hfad.threebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.threebuttons.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val intent = intent
        val textOne = intent.getStringExtra(MainActivity.TEXT_ONE)
        val textTwo = intent.getStringExtra(MainActivity.TEXT_TWO)
        val textThree = intent.getStringExtra(MainActivity.TEXT_THREE)

        when {
            textOne != null -> {
                binding.text.text = resources.getString(R.string.text_one)
            }
            textTwo != null -> {
                binding.text.text = resources.getString(R.string.text_two)
            }
            textThree != null -> {
                binding.text.text = resources.getString(R.string.text_three)
            }
        }



    }
}