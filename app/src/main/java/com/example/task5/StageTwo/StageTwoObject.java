package com.example.task5.StageTwo;

public class StageTwoObject {
    String petName;
    int petImage;

    StageTwoObject(){}

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetImage() {
        return petImage;
    }

    public void setPetImage(int petImage) {
        this.petImage = petImage;
    }

    public StageTwoObject(String petName, int petImage) {
        this.petName = petName;
        this.petImage = petImage;
    }
}
