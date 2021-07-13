package com.example.task5.StageOne;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class StageOneObject {
    String textView;
    int imageView;

    StageOneObject(String s, int degree){}

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public StageOneObject( int imageView, String textView) {
        this.textView = textView;
        this.imageView = imageView;
    }
}
