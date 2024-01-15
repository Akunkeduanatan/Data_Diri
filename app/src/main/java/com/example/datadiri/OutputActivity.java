package com.example.datadiri;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class OutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        String nama = getIntent().getStringExtra("NAMA");
        String alamat = getIntent().getStringExtra("ALAMAT");
        String kota = getIntent().getStringExtra("KOTA");
        String jenisKelamin = getIntent().getStringExtra("JENIS_KELAMIN");

        TextView textViewNama = findViewById(R.id.ETnamaOutput);
        textViewNama.setText(nama);
        TextView textViewAlamat = findViewById(R.id.ETalamatOutput);
        textViewAlamat.setText(alamat);
        TextView textViewKota = findViewById(R.id.ETkotaOutput);
        textViewKota.setText(kota);
        TextView textViewJK = findViewById(R.id.ETjkOutput);
        textViewJK.setText(jenisKelamin);


    }
}
