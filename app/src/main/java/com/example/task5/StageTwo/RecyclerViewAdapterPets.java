package com.example.task5.StageTwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task5.R;
import com.example.task5.StageOne.ViewHolder;

import java.util.ArrayList;

public class RecyclerViewAdapterPets extends RecyclerView.Adapter<ViewHolderTwo> {
    Context context;
    ArrayList<StageTwoObject> arrayList;
    @NonNull
    @Override
    public ViewHolderTwo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_pets, parent, false);
        return new ViewHolderTwo(view);
    }

    public RecyclerViewAdapterPets(Context context, ArrayList<StageTwoObject> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTwo holder, int position) {
        holder.petImage.setImageResource(arrayList.get(position).getPetImage());
        holder.petName.setText(arrayList.get(position).getPetName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
