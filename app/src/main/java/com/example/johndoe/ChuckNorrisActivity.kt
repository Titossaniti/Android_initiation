package com.example.johndoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import androidx.activity.ComponentActivity
import kotlin.random.Random

class ChuckNorrisActivity : ComponentActivity() {

    private val factList: List<String> = listOf(
        "Un jour, Lara Croft à voulu battre Chuck Norris, maintenant on l'appelle Dora L'exploratrice",
        "Quand Chuck Norris joue à GTA il tue plein de gangsters, a les 5 étoiles, braque une banque et brasse des millions d'euros. Ensuite il allume la PS4",
        "Chuck Norris peut faire un habit avec un moine.",
        "Chuck Norris ne ment pas, c'est la vérité qui se trompe.",
        "Un jour, Chuck Norris a acheté du poisson chez le boucher.",
        "Les requins regardent Les Dents de Chuck Norris à leurs soirées films d'horreur.",
        "Quand Chuck Norris sera vacciné contre le covid, c'est l'humanité entière qui aura acquis l'immunité collective",
        "Chuck Norris peut faire de la bière en brassant de l'air.",
        "Chuck Norris mine de la crypto-monnaie avec la calculette de sa montre Casio",
        "Un jour Chuck Norris a eu un zero en latin, depuis c'est une langue morte.",
        "L'avenir se demande parfois ce que Chuck Norris lui réserve.",
        "Chuck Norris peut ressusciter un angle mort.",
        "Un jour, les PowerRangers ont rencontré Chuck Norris. Maintenant on les appelle les Télétubbies."
    )

    private lateinit var imgChuck: ImageView
    private lateinit var factText: TextView;
    private lateinit var buttonChuck: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chuck_norris)



        imgChuck = findViewById<ImageView>(R.id.imgChuckNorris)
        factText = findViewById<TextView>(R.id.factChuckNorris)
        buttonChuck = findViewById<Button>(R.id.buttonChuckNorris)

        buttonChuck.setOnClickListener{
            changeFact()
        }

        imgChuck.setOnClickListener{
            changeFact()
        }

        changeFact()

    }
    private fun changeFact(){
        val random = Random.nextInt(0, factList.size)
        factText.text = factList[random]
    }
}