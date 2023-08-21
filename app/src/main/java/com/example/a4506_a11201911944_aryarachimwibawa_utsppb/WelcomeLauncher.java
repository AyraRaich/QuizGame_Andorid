package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeLauncher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_launcher);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeLauncher.this, WelcomeBack.class);
        startActivity(i);
    }

    public void clickContactUs(View view) {
        Intent i = new Intent(WelcomeLauncher.this, ContactMain.class);
        startActivity(i);
    }
}