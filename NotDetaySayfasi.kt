package com.example.kampsyaam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotDetaySayfasi : AppCompatActivity() {

    private lateinit var tvNoteDisplay: TextView
    private lateinit var btnGoBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Tasarım dosyasını bağlıyoruz
        setContentView(R.layout.activity_not_detay_sayfasi)

        // ID'leri eşleştiriyoruz
        tvNoteDisplay = findViewById(R.id.tvNoteDisplay)
        btnGoBack = findViewById(R.id.btnGoBack)

        // Ana sayfadan gelen veriyi (Intent) alıyoruz
        val receivedNote = intent.getStringExtra("USER_NOTE")

        // Eğer boş değilse TextView içine yazdırıyoruz
        if (receivedNote != null) {
            tvNoteDisplay.text = receivedNote
        }

        // Geri dönme butonu
        btnGoBack.setOnClickListener {
            finish() // Bu sayfayı kapatıp bir öncekine döner
        }
    }
}