package com.example.johndoe

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.annotation.RequiresApi
import com.example.johndoe.model.User

class SecondActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name: String? = intent.getStringExtra("Name")
        val age: Int = intent.getIntExtra("Age", 0)

        val user = intent.getParcelableExtra("user", User::class.java)
        if(user != null){
            val myText = findViewById<TextView>(R.id.textNameAge)
            myText.text = "Name : ${user.nom} Age : ${user.age}"
        }

    }
}