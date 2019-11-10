package com.android.upslatihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvUang;
    Double uangTransportHariIni;
    Double uangTransportBesok3Hari;
    Double hasilUangTransport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat log
        Log.e("TAG", "ini onCreate method");
        //membuat toast
        Toast.makeText(MainActivity.this, "Ini onCreate", Toast.LENGTH_SHORT).show();
        //membuat method
        hitungDuit();
    }

    private void hitungDuit() {
        //membuat variabel duit saya
        uangTransportHariIni=25000.00;
        uangTransportBesok3Hari=75000.00;
        hasilUangTransport=uangTransportHariIni+uangTransportBesok3Hari;

        Toast.makeText(this, "Hasil Rp"+hasilUangTransport, Toast.LENGTH_SHORT).show();
        tvUang = (TextView)findViewById(R.id.tv_uang);
        tvUang.setText("Hasil Rp"+hasilUangTransport);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "ini onStart method");
        Toast.makeText(MainActivity.this, "Ini onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG", "inin adalah method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "ini adalah method onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "ini adalah method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "ini adalah method onDestroy");
    }
}
