package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HasilKuis extends SuccessActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);


        nilai.setText(""+SuccessActivity.hasil);
    }
    public void ulangi(View view){
        finish();
        Intent a = new Intent(getApplicationContext(),SuccessActivity.class);
        startActivity(a);
    }
}