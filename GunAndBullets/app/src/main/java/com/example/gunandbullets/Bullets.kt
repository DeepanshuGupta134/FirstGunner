package com.example.gunandbullets

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.bullet.*
//import kotlinx.android.synthetic.main.bullet.*
import kotlinx.android.synthetic.main.main.*

class Bullets : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bullet)
        var number: String = "7.62"
//        val number1: Double = 7.52


        val bundle: Bundle? = intent.extras
        val id = bundle?.get("id_value")
        var arr = bundle?.getStringArrayList("arr")
        val language = bundle?.get("language_value")
        Toast.makeText(applicationContext, id.toString() + " " + language, Toast.LENGTH_LONG).show()
        bullet_button1.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            arr?.add(number)
            intent.putExtra("bullet", number)
            startActivityForResult(intent,2)
        }

        bullet_button2.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            number = "5.56"
            arr?.add(number)
            intent.putExtra("bullet", number)
//            startActivityForResult(intent,2)
            setResult(2, intent)
            finish()
        }
    }

}

