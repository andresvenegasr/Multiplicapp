package com.venegasdev.multiplicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG = "com.venegas.multiplicapp.mainactivity.tabla"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentTablasMultiplicar = Intent(this, TablasMultiplicarActivity::class.java)

        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)
        val btn10: Button = findViewById(R.id.btn10)

        btn1.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 1)
            startActivity(intentTablasMultiplicar)
        }

        btn2.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 2)
            startActivity(intentTablasMultiplicar)
        }

        btn3.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 3)
            startActivity(intentTablasMultiplicar)
        }

        btn4.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 4)
            startActivity(intentTablasMultiplicar)
        }

        btn5.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 5)
            startActivity(intentTablasMultiplicar)
        }

        btn6.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 6)
            startActivity(intentTablasMultiplicar)
        }

        btn7.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 7)
            startActivity(intentTablasMultiplicar)
        }

        btn8.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 8)
            startActivity(intentTablasMultiplicar)
        }

        btn9.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 9)
            startActivity(intentTablasMultiplicar)
        }

        btn10.setOnClickListener {
            intentTablasMultiplicar.putExtra(TAG, 10)
            startActivity(intentTablasMultiplicar)
        }
    }
}