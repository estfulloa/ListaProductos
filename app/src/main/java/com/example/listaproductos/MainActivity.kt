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
    var productos = arrayOf("Producto 1","Producto 2","Producto 3","Producto 4",
        "Producto 5","Producto 6","Producto 7","Producto 8","Producto 9","Producto 10","Producto 11","Producto 12")

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