package com.example.poprekrucany.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

        val zlobri = arrayListOf("Špajzo", "Hosťo", "Tono", "Julo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play.setOnClickListener {
            println("\nGenerujem hru...\n\n")

            val random = Random()
            val randomZlobor = random.nextInt(zlobri.count())
            textView.text = "Spoza krovia vyskočil " + zlobri[randomZlobor] +",\n" + "a ukradol ti poklop.."
        }

        settings.setOnClickListener {
            println("Spúšťam nastavenia hry..")
        }

        quit.setOnClickListener {
            println("Vypínam hru..")
        }

    }
}
