package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        editTextEmail = findViewById(R.id.edt_txt_email);
    }
    public void postSendRequest(View view) {
        // Validasi email kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak Kosong",Toast.LENGTH_SHORT).show();
        }
        // Validasi format email
        else if (!isValidEmail(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "abc@abc.com", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(ForgotPassword.this, ResetPassword.class);
            startActivity(i);
        }

    }
    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}