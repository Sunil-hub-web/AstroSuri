package com.in.astrosuri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    TextView text_signin,text_signUp,text_resetNow;
    Button btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        text_resetNow = findViewById(R.id.text_resetNow);
        text_signin = findViewById(R.id.text_signin);
        text_signUp = findViewById(R.id.text_signUp);
        btn_signin = findViewById(R.id.btn_signin);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginPage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        text_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginPage.this,LoginPage_Astro.class);
                startActivity(intent);

            }
        });

        text_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginPage.this,RegisterPage.class);
                startActivity(intent);
            }
        });

    }
}