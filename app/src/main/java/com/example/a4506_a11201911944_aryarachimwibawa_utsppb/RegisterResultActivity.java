package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterResultActivity extends AppCompatActivity {

    //inisialisasi variabel
    TextView tvResultNama, tvResultTanggalLahir, tvResultJenisKelamin, tvResultUsername;

    // Intent key
    public static final String Key_RegisterActivity = "Key_RegisterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_result);
        tvResultNama = findViewById(R.id.tvResultNama);
        tvResultTanggalLahir = findViewById(R.id.tvResultTanggalLahir);
        tvResultJenisKelamin = findViewById(R.id.tvResultJenisKelamin);
        tvResultUsername = findViewById(R.id.tvResultUsername);
        Register register = getIntent().getParcelableExtra(Key_RegisterActivity);
        tvResultNama.setText(register.getNama());
        tvResultTanggalLahir.setText(register.getTanggalLahir());
        tvResultJenisKelamin.setText(register.getJenisKelamin());
        tvResultUsername.setText(register.getUsername());
    }

    public void clickLog(View view) {
        Intent i = new Intent(RegisterResultActivity.this, WelcomeBack.class);
        startActivity(i);
    }
}