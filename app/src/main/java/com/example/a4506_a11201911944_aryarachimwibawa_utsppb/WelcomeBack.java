package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomeBack extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);
        editTextEmail = findViewById(R.id.edt_txt_email);
        editTextPassword = findViewById(R.id.edt_txt_password);
    }
    public void postLogin(View view) {
        // Validasi input email dan password kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())&&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email dan Password Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
        }
        // Validasi input email kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak Valid",Toast.LENGTH_SHORT).show();
        }
        // Validasi inputan tipe email
        else if(!isValidEmail(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Password Tidak Valid",Toast.LENGTH_SHORT).show();
        }
        // Validasi password kosong
        else if(TextUtils.isEmpty(editTextPassword.getText().toString())){
            Toast.makeText(view.getContext(),"Password Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(WelcomeBack.this,SuccessActivity.class);
            startActivity(i);
        }
    }
    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
    public void clickForgot(View view) {
        Intent i = new Intent(WelcomeBack.this, ForgotPassword.class);
        startActivity(i);
    }

    public void clickSignUp(View view) {
        Intent i = new Intent(WelcomeBack.this, RegisterActivity.class);
        startActivity(i);
    }
}