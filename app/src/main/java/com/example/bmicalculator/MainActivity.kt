package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener {
            val input:String = editText.text.toString();
            val input1:String = editText3.text.toString();

            val value:Double = input.toDouble();
            val value1:Double = input1.toDouble();

            val result:Double = value / (value1 * value1);

            textView3.text = "%.2f".format(result);
            if(result <= 18.50){
                imageView2.setImageResource(R.drawable.under)
                textView3.text = "%.2f".format(result) + "(underweight)";
            }else if (result <=24.9 ){
                imageView2.setImageResource(R.drawable.normal)
                textView3.text = "%.2f".format(result) + "(normal)";
            }else if (result >= 24.9 ){
            imageView2.setImageResource(R.drawable.over)
            textView3.text = "%.2f".format(result) + "(overweight)";
           }else
                imageView2.setImageResource(R.drawable.empty)



        }

        btnReset.setOnClickListener {
            textView3.text = ""
            editText.text.clear()
            editText3.text.clear()
            imageView2.setImageResource(R.drawable.empty)
        }
    }

}
