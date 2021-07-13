package com.example.task5.StageTwo;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task5.R;

public class ViewHolderTwo extends RecyclerView.ViewHolder {
    TextView petName;
    ImageView petImage;
    public ViewHolderTwo(@NonNull View itemView) {
        super(itemView);
        petName= itemView.findViewById(R.id.pet_name);
        petImage= itemView.findViewById(R.id.pet_image);
    }
}
