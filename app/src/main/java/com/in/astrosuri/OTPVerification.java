package com.in.astrosuri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OTPVerification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverification);

        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}