package com.example.kampsyaam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GununNotuAnaSayfa : AppCompatActivity() {

    // Bileşenleri tanımlıyoruz (lateinit var ile sonradan başlatılacağını belirtiyoruz)
    private lateinit var etDailyNote: EditText
    private lateinit var btnSaveNote: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Tasarım dosyasını bağlıyoruz
        setContentView(R.layout.activity_gunun_notu)

        // ID'leri eşleştiriyoruz
        etDailyNote = findViewById(R.id.etDailyNote)
        btnSaveNote = findViewById(R.id.btnSaveNote)

        // Buton tıklanma olayı
        btnSaveNote.setOnClickListener {
            val noteText = etDailyNote.text.toString().trim()

            if (noteText.isNotEmpty()) {
                // NotDetaySayfasi'na geçiş yapıyoruz
                val intent = Intent(this, GununNotuAnaSayfa::class.java)
                intent.putExtra("USER_NOTE", noteText)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Lütfen bir not girin!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}