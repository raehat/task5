package com.example.task5.StageThree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task5.R;

import java.util.ArrayList;

public class RecyclerViewAdapterPeople extends RecyclerView.Adapter<ViewHolderPeople> {

    Context context;
    ArrayList<StageThreeObject> arrayList;

    public RecyclerViewAdapterPeople(Context context, ArrayList<StageThreeObject> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolderPeople onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_people, parent, false);
        return new ViewHolderPeople(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPeople holder, int position) {

        holder.peopleName.setText(arrayList.get(position).getPeople_name());
        holder.peopleImage.setImageResource(arrayList.get(position).getPeople_image());
        holder.peopleProfession.setText(arrayList.get(position).getPeople_profession());
        holder.noOfFollowing.setText(arrayList.get(position).getNoOfFollowing());
        holder.noOfFollowers.setText(arrayList.get(position).getNoOfFollowers());
        holder.noOfFollowing.setText(arrayList.get(position).getNoOfFollowing());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
