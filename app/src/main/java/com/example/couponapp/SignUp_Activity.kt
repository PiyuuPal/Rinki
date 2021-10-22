package com.example.couponapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.couponapp.ui.sign_up.SignUpFragment

class SignUp_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up__activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SignUpFragment.newInstance())
                .commitNow()
        }
    }
}