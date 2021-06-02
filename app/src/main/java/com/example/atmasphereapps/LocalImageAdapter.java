package com.example.atmasphereapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

//import com.bedboy.ufebri.retrofitimages.entity.LocalImages;
import com.example.atmasphereapps.entity.LocalImages;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LocalImageAdapter extends RecyclerView.Adapter<LocalImageAdapter.Holder> {


    /*
   NIM             : 10118004
   Nama            : Dahlia
   Kelas           : IF1
   Matakuliah      : Aplikasi Komputasi Bergera

    8 Mei 2021 : Membuat adapter untuk fragment gallery, example from ufebri
     */

    private List<LocalImages> images;
    private Context context;

    LocalImageAdapter(ArrayList<LocalImages> images, Context context) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public LocalImageAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        context = parent.getContext();
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocalImageAdapter.Holder holder, int position) {
        LocalImages allData = images.get(position);
        holder.bind(allData);
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    static class Holder extends RecyclerView.ViewHolder {
        Holder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(LocalImages allData) {
            ImageView ivLocal = itemView.findViewById(R.id.iv_animal);
            ivLocal.setImageResource(allData.imageId);
        }
    }
}
