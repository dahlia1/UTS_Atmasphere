package com.example.atmasphereapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;


public class DailyFragment extends Fragment {
    /*
    NIM             : 10118004
    Nama            : Dahlia
    Kelas           : IF1
    Matakuliah      : Aplikasi Komputasi Bergerak

    4 Mei 2021  : Membuat aktivity daily_fragment untuk logic ketika bottomviewer diklik. juga membuat layout daily untuk tampilan fragment
    10 Mei 2021 : Mnegupdate daily fragment untuk diterapkan 2 recycler view
    14 Mei 2021 : Mengubah recyclerview kedua menjadi horizontal
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.daily, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_daily1);
        ListAdapter listAdapter = new ListAdapter();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


//        LinearLayoutManager horizontalLayoutManagaer = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view_daily2);
        ListAdapter2 listAdapter2 = new ListAdapter2();
        recyclerView2.setAdapter(listAdapter2);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
//        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL);

        recyclerView2.setLayoutManager(horizontalLayoutManager);

        return view;
    }
}
