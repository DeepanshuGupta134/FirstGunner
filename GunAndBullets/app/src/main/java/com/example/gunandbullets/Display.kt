package com.example.gunandbullets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.main.*


var guns :String=""
var bullets:String=""
var warriors:String=""
class Display : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display)


//        val bundle: Bundle? = intent.extras
//        val gun = bundle?.get("gun")
//        val bullet = bundle?.get("bullet")
//        val warrior = bundle?.get("warrior")
//
//        var gunRecieved = gun.toString()
//        var bull = bullet.toString()
//        var army = warrior.toString()

//        var arr = bundle?.getStringArrayList("arr")
//        var id = 10

        //Toast.makeText(applicationContext,id.toString()+ " " + gunRecieved , Toast.LENGTH_LONG).show()

        val textView1 = findViewById<TextView>(R.id.gun_view)
        val textView2 = findViewById<TextView>(R.id.bullet_view)
        val textView3 = findViewById<TextView>(R.id.warrior_view)

        textView1.text = "this is the gun $guns"
        val textViewValue1 = textView1.text

        textView2.text="this is the bullet $bullets"
        val textViewValue2 = textView2.text

        textView3.text="this is the warrior $warriors"
        val textViewValue3 = textView2.text


    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Check which request we're responding to


        val bundle: Bundle? = intent.extras
        if (requestCode == 5) {


            guns  = data?.getStringExtra("gun").toString()
            bullets  = bundle?.get("bullet").toString()
            warriors  = bundle?.get("warrior").toString()


        }


    }


}