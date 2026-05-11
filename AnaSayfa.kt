package com.example.kampsyaam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AnaSayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_sayfa)

        // Tasarımdaki derslik butonunu buluyoruz
        val derslikBtn = findViewById<Button>(R.id.btnDerslikA101)

        derslikBtn.setOnClickListener {
            // Butona basınca DetaySayfasi'na git
            val intent = Intent(this, DetaySayfasi::class.java)
            startActivity(intent)
        }
    }
}