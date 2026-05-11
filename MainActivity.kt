package com.example.kampsyaam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Giriş Yap Butonu Bağlantısı
        val loginBtn = findViewById<Button>(R.id.btnLogin)
        loginBtn.setOnClickListener {
            // Butona basınca AnaSayfa'ya git
            val intent = Intent(this, AnaSayfa::class.java)
            startActivity(intent)
        }

        // 2. Kayıt Ol Yazısı Bağlantısı
        val registerTv = findViewById<TextView>(R.id.tvRegister)
        registerTv.setOnClickListener {
            // Yazıya basınca KayitOlActivity'ye git
            // Not: Bu sayfanın adını KayitOlActivity olarak oluşturduğunu varsayıyoruz
            val intent = Intent(this, KayitOlma::class.java)
            startActivity(intent)
        }

        // 3. Şifremi Unuttum Yazısı Bağlantısı
        val forgotPassTv = findViewById<TextView>(R.id.tvForgotPassword)
        forgotPassTv.setOnClickListener {
            // Burası için ayrı bir ekran yapmadıysan bile tıklanabilir olması
            // sunumda profesyonel duracaktır.
        }
    }
}