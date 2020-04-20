package com.bayupradana.projecthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    lateinit var btnSignUp: Button
    lateinit var tvSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btnSignUp = findViewById(R.id.btnSignUp)
        tvSignUp = findViewById(R.id.tvSignUp)

        btnSignUp.setOnClickListener {
            back()

        }

        tvSignUp.setOnClickListener {
            back()
        }
    }

    override fun onBackPressed() {
        back()
    }

    private fun back() {
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out)
    }
}
