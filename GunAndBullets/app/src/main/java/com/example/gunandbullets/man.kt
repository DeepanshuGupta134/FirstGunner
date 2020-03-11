package com.example.gunandbullets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bullet.*
import kotlinx.android.synthetic.main.layoutlist.*
import kotlinx.android.synthetic.main.main.*


var pass: String = ""

class Man : AppCompatActivity() {


    var array = arrayOf("Army", "Navy", "Airforce")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutlist)

        val adapter = ArrayAdapter(this,
            R.layout.listview_items, array)


        val listView: ListView = findViewById(R.id.listview_1)
        listView.setAdapter(adapter)

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {

            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {

                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String
                 pass = itemValue
                // Toast the values
                Toast.makeText(applicationContext,
                        "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                    .show()


            }




        }

        val bundle: Bundle? = intent.extras
        var arr = bundle?.getStringArrayList("arr")

        Select.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            arr?.add(pass)
            intent.putExtra("warrior", pass)
//            startActivityForResult(intent,3)
            setResult(3, intent)
            finish()

        }






    }



}