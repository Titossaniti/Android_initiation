package com.example.johndoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.johndoe.model.User

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.main_button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Name", "John Doe")
            intent.putExtra("Age", 30)

            val user = User("Thomas", 78)
            intent.putExtra("user", user)

            startActivity(intent)
        }

        val scndButtonClick = findViewById<Button>(R.id.scnd_button)
        scndButtonClick.setOnClickListener{
            startActivity(Intent(this, ChuckNorrisActivity::class.java))
        }
    }
}