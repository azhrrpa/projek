package com.example.farmasiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Navigasi ke halaman profil
        findViewById<Button>(R.id.btn_sign_up).setOnClickListener {
            // Intent ke halaman profil (buat Activity lain jika diperlukan)
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}