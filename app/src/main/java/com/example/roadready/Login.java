package com.example.roadready;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
  private Button signupBtn;
  private Button lgnBtn;
  private EditText email,passEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText) findViewById(R.id.email);
        passEditText = (EditText) findViewById(R.id.passEditText);
        lgnBtn = (Button) findViewById(R.id.lgnBtn);
        lgnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("dealer") && passEditText.getText().toString().equals("dealer")){
                    openDealerHome();
                }
                else if(email.getText().toString().equals("buyer") && passEditText.getText().toString().equals("buyer")){
                    openBuyerHome();
                }
                else{
                    Toast.makeText(Login.this,"Invalid Input",Toast.LENGTH_LONG).show();
                }
            }
        });
        signupBtn = (Button) findViewById(R.id.signupBtn);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();

            }
        });

    }
    public void openSignup(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);


    }
    public void openDealerHome(){
        Intent intent = new Intent(this, DealerHome.class);
        startActivity(intent);
    }
    public void openBuyerHome(){
        Intent intent = new Intent(this,BuyerHome.class);
        startActivity(intent);
    }
}