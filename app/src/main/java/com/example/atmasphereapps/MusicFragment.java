package com.example.atmasphereapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.atmasphereapps.entity.AdapterMusic;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MusicFragment extends Fragment {
    /*
     NIM             : 10118004
     Nama            : Dahlia
     Kelas           : IF1
     Matakuliah      : Aplikasi Komputasi Bergera

    4 Mei 2021  : Membuat aktivity music_fragment untuk logic ketika bottomviewer diklik. juga membuat layout music untuk tampilan fragment
    12 Mei 2021 : Mengupdate fragment music serta layoutnya untuk di isi konten
     */



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.music, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_music);
        AdapterMusic listAdapter = new AdapterMusic();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }


}
