package com.example.atmasphereapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AccountFragment extends Fragment {
    /*
    NIM             : 10118004
    Nama            : Dahlia
    Kelas           : IF1
    Matakuliah      : Aplikasi Komputasi Bergerak

    4 Mei 2021  : Membuat aktivity account_fragment untuk logic ketika bottomviewer diklik. juga membuat layout acoount untuk tampilan fragment
    15 Mei 2021 : Membuat findme, connect instagram, dan konten untuk fragment account
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.account, container, false);
        return view;
    }




}

