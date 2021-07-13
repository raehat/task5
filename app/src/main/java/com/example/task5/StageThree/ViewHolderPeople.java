package com.example.task5.StageThree;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task5.R;

public class ViewHolderPeople extends RecyclerView.ViewHolder {

    ImageView peopleImage;
    TextView peopleName, peopleProfession, noOfFollowing, noOfPosts, noOfFollowers;

    public ViewHolderPeople(@NonNull View itemView) {
        super(itemView);

        peopleImage= itemView.findViewById(R.id.people_image);
        peopleProfession= itemView.findViewById(R.id.people_profession);
        peopleName= itemView.findViewById(R.id.people_name);
        noOfFollowers= itemView.findViewById(R.id.no_of_followers);
        noOfFollowing= itemView.findViewById(R.id.no_of_following);
        noOfPosts= itemView.findViewById(R.id.no_of_posts);

    }
}
