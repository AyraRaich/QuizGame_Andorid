package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity{
    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    //pertanyaan
    String[] pertanyaan_kuis = new String[]{
            "1. Presiden Indonesia yang keenam adalah?",
            "2. Apakah Huruf keempat dalam abjad adalah?",
            "3. Ibukota Indonesia adalah?",
            "4. Pagi 4 kaki,Siang 2 kaki, Malam 3 kaki. Apakah aku ini?",
            "5. Bendera Negara Indonesia adalah?"
    };

    //pilihan jawaban a, b, c, d
    String[] pilihan_jawaban = new String[]{
            "Soekarno", "Habibie", "Susilo Bambang Yudhoyono", "Joko Widodo",
            "A", "c", "d", "a",
            "Jakarta", "Bogor", "Semarang", "Bandung",
            "Harimau", "Satan", "Manusia", "Keajaiban",
            "Merah Biru Putih", "Merah Putih", "Putih Merah", "Belang-belang"
    };

    //jawaban benar
    String[] jawaban_benar = new String[]{
            "Susilo Bambang Yudhoyono",
            "a",
            "Jakarta",
            "Manusia",
            "Merah Putih"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        kuis = (TextView) findViewById(R.id.kuis);
        rg = (RadioGroup) findViewById(R.id.pilihan);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        kuis.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }
    public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.length) {
                kuis.setText(pertanyaan_kuis[nomor]);
                PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
                PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
                PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
                PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);

            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(SuccessActivity.this, HasilKuis.class);
                startActivity(selesai);
            }
        }
        else {
            Toast.makeText(this,"Kamu Jawab Dulu", Toast.LENGTH_LONG).show();
        }
    }
}