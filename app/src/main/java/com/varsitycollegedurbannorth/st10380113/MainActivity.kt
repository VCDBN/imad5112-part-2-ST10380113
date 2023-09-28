package com.varsitycollegedurbannorth.st10380113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create variables and get reference to the ID using the View method
        var btnAdd = findViewById<Button>(R.id.btnAdd)

        var tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        var tvError = findViewById<TextView>(R.id.tvError)

        var edtNum1 = findViewById<EditText>(R.id.edtNum1)

        var edtNum2 = findViewById<EditText>(R.id.edtNum2)

        var btnSubtract = findViewById<Button>(R.id.btnSubtract)

        var btnMultiply = findViewById<Button>(R.id.btnMultiply)

        var btnDivide = findViewById<Button>(R.id.btnDivide)

        var btnSquareRoot = findViewById<Button>(R.id.btnSquareRoot)

        var btnPower = findViewById<Button>(R.id.btnPower)

        btnAdd.setOnClickListener {

            //create and initialize variables
            val Num1 = edtNum1.text.toString().toInt()
            val Num2 = edtNum2.text.toString().toInt()

            //create and initialize a variable
            //add the two numbers entered to each other
            val Answer = Num1 + Num2

            //create and initialize a variable
            //create a string that contains the entire equation with the numbers entered and the answer
            val Result = "$Num1 + $Num2 = $Answer"

            //display the equation
            tvDisplay.text = Result
            tvError.text = "No error occurred"
        }


        btnSubtract.setOnClickListener {

            //create and initialize variables
            val Num1 = edtNum1.text.toString().toInt()
            val Num2 = edtNum2.text.toString().toInt()

            //create and initialize a variable
            //subtract the two numbers entered from each other
            val Answer = Num1 - Num2

            //create and initialize a variable
            //create a string that contains the entire equation with the numbers entered and the answer
            val Result = "$Num1 - $Num2 = $Answer"

            //display the equation
            tvDisplay.text = Result
            tvError.text = "No error occurred"
        }

        //
        btnMultiply.setOnClickListener {

            //create and initialize variables
            val Num1 = edtNum1.text.toString().toInt()
            val Num2 = edtNum2.text.toString().toInt()

            //create and initialize a variable
            //multiply the two numbers entered with each other
            val Answer = Num1 * Num2

            //create and initialize a variable
            //create a string that contains the entire equation with the numbers entered and the answer
            val Result = "$Num1 x $Num2 = $Answer"

            //display the equation
            tvDisplay.text = Result
            tvError.text = "No error occurred"
        }

        btnDivide.setOnClickListener {
            //create and initialize variables
            val Num1 = edtNum1.text.toString().toDouble()
            val Num2 = edtNum2.text.toString().toDouble()

            //checks to see if the second number entered is zero
            if (Num2 == 0.0) {

                //create a string that contains the statement needed to be displayed to the user
                //display the error message if the second number entered is zero
                tvError.text = "Error: Division by 0 is not allowed"
            }else{
                tvError.text = "No error occurred"
                //create and initialize a variable
                //divide the two numbers entered together only if the second number is not zero
                val Answer = Num1/ Num2

                //create a string that contains the entire equation with the numbers entered and the answer
                //display the equation
                tvDisplay.text= "$Num1 / $Num2 = $Answer"
            }
        }

        btnSquareRoot.setOnClickListener {
            tvError.text = "No error occurred"
            //create and initialize variables
            val Num1 = edtNum1.text.toString().toDouble()
            val Result = Math.sqrt(Num1)

            //checks to see if the first number entered is less than zero
            if (Num1 < 0) {
                //create and initialize variables
                //square root the first number
                val Result = Math.sqrt(Math.abs(Num1))

                //create a string that contains the entire equation with the number entered and the answer
                //display the equation with an "i" at the end only if the first number entered is less than zero
                tvDisplay.text = "sqrt($Num1) = ${Result} i"
            } else {
                //create and initialize variables
                //square root the first number
                val Result = Math.sqrt(Num1)

                //create a string that contains the entire equation with the number entered and the answer
                //display the equation
                tvDisplay.text = "sqrt($Num1) = $Result"
            }
        }

        btnPower.setOnClickListener {
            //create and initialize variables
            val Num1=edtNum1.text.toString().toDouble()
            val Num2=edtNum2.text.toString().toDouble()

            //make the first number the base and the second number the exponent
            val Sum = Math.pow(Num1, Num2)

            //create a string that contains the entire equation with the numbers entered and the answer
            //display the equation
            tvDisplay.text= "" + Num1 + "^" + Num2 + "=" + Sum
            }
        }
}
