package com.bayupradana.projecthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {

    lateinit var btnGet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        btnGet = findViewById(R.id.btn_getStarted)
        btnGet.setOnClickListener {
            finish()
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)

        }
    }

    override fun onBackPressed() {
        finish()
    }
}
