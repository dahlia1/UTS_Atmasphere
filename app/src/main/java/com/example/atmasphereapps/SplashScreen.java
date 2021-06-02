package com.example.atmasphereapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    /*
       NIM             : 10118004
       Nama            : Dahlia
       Kelas           : IF1
       Matakuliah      : Aplikasi Komputasi Bergera

       3 Mei 2021  : Membuat activity splash screen untuk menampilkan layout splash screen selama 4 detik kemudian pindah ke activity welcome
        */
    private int waktu_loading=2500;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent welcome=new Intent(SplashScreen.this, Welcome.class);
                startActivity(welcome);
                finish();

            }
        },waktu_loading);
    }
}