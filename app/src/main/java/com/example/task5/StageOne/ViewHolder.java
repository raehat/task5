package com.example.task5.StageOne;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task5.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView= itemView.findViewById(R.id.left_image);
        textView= itemView.findViewById(R.id.middle_text);
    }
}
