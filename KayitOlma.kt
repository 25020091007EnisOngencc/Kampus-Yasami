package com.example.kampsyaam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class KayitOlma : AppCompatActivity() { // Dosya adıyla aynı yaptık
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayit_olma) // Tasarım dosyanın adı

        val btnConfirm = findViewById<Button>(R.id.btnRegisterConfirm)

        btnConfirm.setOnClickListener {
            Toast.makeText(this, "Kayıt Başarıyla Tamamlandı!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}