package com.example.roadready;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SignupDealership extends Login {
    private Spinner spinner;
    private Button lgnBtn2,sgnupBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_dealership);
        sgnupBtn = (Button) findViewById(R.id.sgnupBtn);

        sgnupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDealerHome();
            }
        });


        final List<String> gender = Arrays.asList("Gender", "Male", "Female");

        final Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item,gender);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String newItem = spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        lgnBtn2 = (Button) findViewById(R.id.lgnBtn2);
        lgnBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        });


    }


}