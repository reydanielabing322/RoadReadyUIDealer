package com.example.roadready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    private Button lgn1Btn;
    private Button buyerBtn;
    private Button dealerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        buyerBtn = (Button) findViewById(R.id.buyerBtn);
        dealerBtn = (Button) findViewById(R.id.dealerBtn);
        dealerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignupDealer();
            }
        });
        lgn1Btn = (Button) findViewById(R.id.lgn1Btn);
        lgn1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginAct();
            }
        });
    }

    public void openLoginAct(){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);

    }
    public void openSignupDealer(){
        Intent intent = new Intent(this,SignupDealership.class);
        startActivity(intent);

    }
}