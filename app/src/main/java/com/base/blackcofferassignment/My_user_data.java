package com.base.blackcofferassignment;

import android.widget.ImageView;
import android.widget.ProgressBar;

public class My_user_data {

    private String userName;
    private String Location_Position;
    private String range;
    private String selected_feature;
    private String Bio;

    ProgressBar progressBar;

    private Integer imageView;

    public My_user_data(String userName, String location_Position, String range, String selected_feature, String bio, ProgressBar progressBar, Integer imageView) {
        this.userName = userName;
        Location_Position = location_Position;
        this.range = range;
        this.selected_feature = selected_feature;
        Bio = bio;
        this.progressBar = progressBar;
        this.imageView = imageView;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLocation_Position(String location_Position) {
        Location_Position = location_Position;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public void setSelected_feature(String selected_feature) {
        this.selected_feature = selected_feature;
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation_Position() {
        return Location_Position;
    }

    public String getRange() {
        return range;
    }

    public String getSelected_feature() {
        return selected_feature;
    }

    public String getBio() {
        return Bio;
    }

    public ProgressBar getProgressBar() {
        return progressBar;
    }

    public Integer getImageView() {
        return imageView;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public void setProgressBar(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public void setImageView(Integer imageView) {
        this.imageView = imageView;
    }


}
