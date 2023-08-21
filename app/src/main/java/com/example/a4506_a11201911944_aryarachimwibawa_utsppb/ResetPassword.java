package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {
    EditText editTxtCode, editTxtNewPass, editTxtConfirmNewPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        editTxtCode = findViewById(R.id.edt_txt_code);
        editTxtNewPass = findViewById(R.id.edt_new_password);
        editTxtConfirmNewPass = findViewById(R.id.edt_confirm_password);
    }
    public void postChangePassword(View view) {
        // Validasi kosong
        if(TextUtils.isEmpty(editTxtCode.getText().toString().trim()) ||
                TextUtils.isEmpty(editTxtNewPass.getText().toString()) ||
                TextUtils.isEmpty(editTxtConfirmNewPass.getText().toString())) {
            Toast.makeText(view.getContext(), "Tidak boleh ada isian yang kosong",
                    Toast.LENGTH_LONG).show();
        }
        // Cek inputan new dan confirm
        else if (editTxtNewPass.getText().toString() != editTxtConfirmNewPass.getText().toString()) {
            Toast.makeText(view.getContext(), "Password tidak sama!", Toast.LENGTH_SHORT).show();
        }
            Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
            startActivity(i);

    }
}