package com.bignerdranch.android.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bignerdranch.android.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindNumber()

        clearAll()

        bindOperation()

    }

    /**
     * This function is to display text in the parameter in the EditText
     * whose ID is resultText
     */
    private fun displayText(text: java.lang.StringBuilder){
        binding.resultText.setText(text)
    }

    /**
     * bindNumber is bind all the numbers to their corresponding functions,
     * and each function has a listener
     */
    private fun bindNumber(){
        binding.button0.setOnClickListener {

        }

        binding.button1.setOnClickListener {

        }

        binding.button2.setOnClickListener {

        }

        binding.button3.setOnClickListener {

        }

        binding.button4.setOnClickListener {

        }

        binding.button5.setOnClickListener {

        }

        binding.button6.setOnClickListener {

        }

        binding.button7.setOnClickListener {

        }

        binding.button8.setOnClickListener {

        }

        binding.button9.setOnClickListener {

        }

        binding.button0.setOnClickListener {

        }
    }

    /**
     * bind operation is having functions that bind the operations.
     * Each operation has one binding function and a listener inside
     */
    private fun bindOperation(){

        binding.buttonMinus.setOnClickListener {

        }

        binding.buttonAdd.setOnClickListener {

        }

        binding.buttonDivide.setOnClickListener {

        }

        binding.buttonMulti.setOnClickListener {

        }

        binding.buttonSqrt.setOnClickListener {

        }
    }

    /**
     * This function is bind the buttonClear to a listener
     */
    private fun clearAll(){
        binding.buttonClear.setOnClickListener {

        }
    }

}