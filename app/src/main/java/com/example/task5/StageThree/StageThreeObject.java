package com.example.task5.StageThree;

public class StageThreeObject {
    int people_image;
    String people_name;
    String people_profession;
    String noOfFollowers, noOfPosts, noOfFollowing;

    StageThreeObject(){}

    public int getPeople_image() {
        return people_image;
    }

    public void setPeople_image(int people_image) {
        this.people_image = people_image;
    }

    public String getPeople_name() {
        return people_name;
    }

    public void setPeople_name(String people_name) {
        this.people_name = people_name;
    }

    public String getPeople_profession() {
        return people_profession;
    }

    public void setPeople_profession(String people_profession) {
        this.people_profession = people_profession;
    }

    public String getNoOfFollowers() {
        return noOfFollowers;
    }

    public void setNoOfFollowers(String noOfFollowers) {
        this.noOfFollowers = noOfFollowers;
    }

    public String getNoOfPosts() {
        return noOfPosts;
    }

    public void setNoOfPosts(String noOfPosts) {
        this.noOfPosts = noOfPosts;
    }

    public String getNoOfFollowing() {
        return noOfFollowing;
    }

    public void setNoOfFollowing(String noOfFollowing) {
        this.noOfFollowing = noOfFollowing;
    }

    public StageThreeObject(int people_image, String people_name, String people_profession, String noOfFollowers, String noOfPosts, String noOfFollowing) {
        this.people_image = people_image;
        this.people_name = people_name;
        this.people_profession = people_profession;
        this.noOfFollowers = noOfFollowers;
        this.noOfPosts = noOfPosts;
        this.noOfFollowing = noOfFollowing;
    }
}
