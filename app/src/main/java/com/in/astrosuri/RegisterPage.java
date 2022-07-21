package com.in.astrosuri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {

    TextView text_signin,text_signinastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        text_signinastro = findViewById(R.id.text_signinastro);
        text_signin = findViewById(R.id.text_signin);

        text_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterPage.this,LoginPage.class);
                startActivity(intent);
            }
        });

        text_signinastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegisterPage.this,LoginPage_Astro.class);
                startActivity(intent);
            }
        });
    }
}