package com.example.roadready

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    private var lgn1Btn: Button? = null
    private var buyerBtn: Button? = null
    private var dealerBtn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        buyerBtn = findViewById<View>(R.id.buyerBtn) as Button
        dealerBtn = findViewById<View>(R.id.dealerBtn) as Button
        dealerBtn!!.setOnClickListener { openSignupDealer() }
        lgn1Btn = findViewById<View>(R.id.lgn1Btn) as Button
        lgn1Btn!!.setOnClickListener { openLoginAct() }
    }

    fun openLoginAct() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    fun openSignupDealer() {
        val intent = Intent(this, SignupDealership::class.java)
        startActivity(intent)
    }
}