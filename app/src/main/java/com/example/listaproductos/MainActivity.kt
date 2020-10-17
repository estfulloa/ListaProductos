package com.example.listaproductos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//Lista de componentes mediante un arreglo para poder trabajarlos.
    var productos = arrayOf("Opcion 1","Opcion 2","Opcion 3","Opcion 4",
        "Opcion 5","Opcion 6","Opcion 7","Opcion 8","Opcion 9","Opcion 10","Opcion 11","Opcion 12")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // valores para conocer el listView
        val listView = this.list_productos
        // Se crea un adaptador
        val adaptador = ArrayAdapter(this, R.layout.list_item, productos)
        listView.adapter = adaptador
        //Para conocer el evento que pasa, cual es el listView que se presiona.
        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val item = listView.getItemAtPosition(position) as String
               // Log.e("ListViewAPP", "Seleccionaste $item")
                Toast.makeText(this@MainActivity, "Presionaste: $item", Toast.LENGTH_LONG).show()
            }


        }
    }
}