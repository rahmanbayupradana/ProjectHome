package com.bayupradana.projecthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {

    lateinit var btnSignIn: Button
    lateinit var tvSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btnSignIn = findViewById(R.id.btnSignIn)
        tvSignUp = findViewById(R.id.tvSignUp)

        btnSignIn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }

        tvSignUp.setOnClickListener {
            val goSignUp = Intent(this, SignUpActivity::class.java)
            startActivity(goSignUp)
            overridePendingTransition(R.anim.slide_in, R.anim.slide_in_out)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}
