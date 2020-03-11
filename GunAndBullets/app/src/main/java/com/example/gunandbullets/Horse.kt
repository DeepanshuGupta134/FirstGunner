package com.example.gunandbullets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.main.*



class Horse : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        var number:String

        val bundle: Bundle? = intent.extras



        var test= bundle?.getStringArrayList("arr")
        val id = bundle?.get("id_value")
        val language = bundle?.get("language_value")
        //Toast.makeText(applicationContext,id.toString()+" "+,Toast.LENGTH_LONG).show()
        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            number = "M416"
            test?.add(number)
            intent.putExtra("gun", number)
            intent.putStringArrayListExtra("arr",test)
           setResult(1, intent)
            finish()
        }

        AKM.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            number = "AKM"
            test?.add(number)
            intent.putExtra("gun", number)
            intent.putStringArrayListExtra("arr",test)
//            startActivityForResult(intent,1)
            setResult(1, intent)
            finish()
        }
    }







}