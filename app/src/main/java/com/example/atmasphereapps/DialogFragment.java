package com.example.atmasphereapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

        /*
        NIM             : 10118004
        Nama            : Dahlia
        Kelas           : IF1
        Matakuliah      : Aplikasi Komputasi Bergerak

        15 Mei 2021 : Membuat fragment dialog fragment
         */
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            super.onCreateView(inflater,container,savedInstanceState);
            View view = inflater.inflate(R.layout.dialog_version, container, false);
            return view;
        }



}

