package com.venegasdev.multiplicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class TablasMultiplicarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablas_multiplicar)

        val tabla: Int = intent.getIntExtra("com.venegas.multiplicapp.mainactivity.tabla", 0)
        val lvResultado: ListView = findViewById(R.id.lvResultados)

        var operaciones: ArrayList<String> = ArrayList()
        var results: ArrayList<Int> = ArrayList()

        for (i in 0..10){
            var result = tabla * i

            operaciones.add("${tabla} * ${i} = ${result}")
            results.add(result)
        }

        val adapterLV = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, operaciones)
        lvResultado.adapter = adapterLV

        lvResultado.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, results.get(position).toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
