package com.example.datadiri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmitClick(View view) {
        // Get the data from the input fields
        String nama = ((EditText) findViewById(R.id.ETnama)).getText().toString();
        String alamat = ((EditText) findViewById(R.id.ETalamat)).getText().toString();
        String kota = ((Spinner) findViewById(R.id.list_kota)).getSelectedItem().toString();
        String jenisKelamin = ((RadioGroup) findViewById(R.id.pilih_jk)).getCheckedRadioButtonId() == R.id.laki ? "Laki-Laki" : "Perempuan";

        Intent intent = new Intent(this, OutputActivity.class);

        intent.putExtra("NAMA", nama);
        intent.putExtra("ALAMAT", alamat);
        intent.putExtra("KOTA", kota);
        intent.putExtra("JENIS_KELAMIN", jenisKelamin);

        startActivity(intent);

        finish();
    }
}
