package com.example.atmasphereapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

     /*
   NIM             : 10118004
   Nama            : Dahlia
   Kelas           : IF1
   Matakuliah      : Aplikasi Komputasi Bergera

    3 Mei 2021  : Membuat aktivity home sebagai tampilan utama dari aplikasi
    5 Mei 2021 : Mengganti warna primer, mengganti background semua fragment
    8 Mei 2021 : Merombak ulang activity home, di refactor untuk mengubah nama agar mempermudah dan merombak struktru fragment serta buttom navigation
    9 Mei 2021 : Menyusun ulang project dan merombak ulang file didalamnya, menghapus drawable file dan layout yang tidak dibutuhkan serta merapikan codingan

     */

    private BottomNavigationView navViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navViewHome = findViewById(R.id.nav_view);
        setupBottomNavigation(savedInstanceState);
    }

    public void buka_map(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Betung,+Pagar+Dewa,+Benakat,+Kabupaten+Muara+Enim,+Sumatera+Selatan/@-3.4321889,103.8148462,15z/data=!3m1!4b1!4m5!3m4!1s0x2e3a16d313aa1285:0x56cb43203172013b!8m2!3d-3.432189!4d103.823601"));
        startActivity(map);
    }

    public void buka_ig(View view) {
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/dahdah.1/"));
        startActivity(instagram);
    }
    public void buka_blog(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dahlia-10118004.medium.com/dasar-dasar-komputer-d0a868c39f86"));
        startActivity(blog);
    }
    public void buka_email(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:dahliaaaa47@gmail.com"));
        startActivity(blog);
    }
    public void buka_dialog(View view) {
        DialogFragment dialogFragment = new DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DialogFragment");
    }

    private void setupBottomNavigation(Bundle savedInstanceState) {
        BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
                = item -> {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.account_menu:
                    fragment = new AccountFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.gallery_menu:
                    fragment = new GalleryFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.daily_menu:
                    fragment = new DailyFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.music_menu:
                    fragment = new MusicFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
            }
            return false;
        };
        navViewHome.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        if (savedInstanceState == null) {
            navViewHome.setSelectedItemId(R.id.home_menu);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}