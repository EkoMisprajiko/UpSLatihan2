package com.android.upslatihan2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HitungHitungDuit extends AppCompatActivity {
    //deklarasi variabel
    TextView tvHasil;
    EditText editNilai1,editNilai2;
    Button btnHitung;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //panggil view
        setContentView(R.layout.hitung_duit);
        //inisialisasi
        editNilai1 = (EditText) findViewById(R.id.nilai1);
        editNilai2 = (EditText) findViewById(R.id.nilai2);
        tvHasil    = (TextView) findViewById(R.id.tv_hasil);
        btnHitung  = (Button) findViewById(R.id.btn_hitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HitungHitungDuit.this, "Menghitung...", Toast.LENGTH_SHORT).show();
                hitungDuit();
            }
        });

    }

    private void hitungDuit() {
        String ambilNilai1 = editNilai1.getText().toString();
        String ambilNilai2 = editNilai2.getText().toString();

        //validasi
        if(ambilNilai1.isEmpty() || ambilNilai2.isEmpty()){
            Toast.makeText(this, "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }else{
            final Double hasil = Double.valueOf(ambilNilai1)+Double.valueOf(ambilNilai2);

            tvHasil.setText("Hasilnya= "+hasil);

            //dialog
            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

            //attribut title dan message
            alertDialog.setTitle("Hasil Penjumlahan");
            alertDialog.setMessage("Hasilnya= "+hasil);
            alertDialog.setCancelable(false);

            //positif button
            alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    editNilai1.setText("");
                    editNilai2.setText("");
                    tvHasil.setText("");
                }
            });

            //positif button
            alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    //pindah ke activity lain
                    Intent intent = new Intent(HitungHitungDuit.this,WebviewActivity.class);
                    startActivity(intent);
                }
            });

            alertDialog.show();
        }
    }

}
