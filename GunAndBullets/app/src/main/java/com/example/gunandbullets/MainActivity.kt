package com.example.gunandbullets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bullet.*
import kotlinx.android.synthetic.main.main.*


var gun : String =""
var bullet:String = ""
var army:String =""

class MainActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    val id:Int = 10
    val language:String = "kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var lis = arrayListOf<String>()
        button.setOnClickListener() {

            intent = Intent(this, Horse::class.java)
            intent.putExtra("id_value", id)

            intent.putStringArrayListExtra("arr",lis)
            startActivityForResult(intent,4)
        }
        val bundle: Bundle? = intent.extras


        var arr = bundle?.getStringArrayList("arr")

        button4.setOnClickListener() {
            intent = Intent(this, Bullets::class.java)
            intent.putStringArrayListExtra("arr",arr)
            startActivityForResult(intent,6)
        }

        //arr = bundle?.getStringArrayList("arr")


        button99.setOnClickListener() {
            intent = Intent(this, Man::class.java)
            intent.putStringArrayListExtra("arr",arr)
            startActivityForResult(intent,7)
        }
        //arr = bundle?.getStringArrayList("arr")







//        val dg = bundle?.get("pass")
//        //var arrr = bundle?.get("arr")
//        // val kd = bundle?.get("name")
//        val number = bundle?.get("number")
//        val warrior = bundle?.get("type")


//         gun = dg.toString()
//
//        bullet = number.toString()
//         army = warrior.toString()








        displayButton.setOnClickListener() {
            intent = Intent(this, Display::class.java)
            intent.putExtra("gun", gun)
            intent.putExtra("bullet", bullet)
            intent.putExtra("warrior", army)
            intent.putStringArrayListExtra("arr",arr)

            startActivityForResult(intent,5)
        }


        Toast.makeText(applicationContext,id.toString()+ " " + gun + bullet + army , Toast.LENGTH_LONG).show()




    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Check which request we're responding to


        val bundle: Bundle? = intent.extras


        if (requestCode == 1) {


            gun = data?.getStringExtra("gun").toString()


        }

        if(requestCode==2){
            bullet=bundle?.get("bullet").toString()
        }

        if(requestCode==3){
            army=bundle?.get("army").toString()
        }
    }





}


