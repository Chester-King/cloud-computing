package com.example.amazonians.models;

public class UserModel {

    public String username;
    public String email;
    public String phNo;
    public double lat;
    public double lng;

    public UserModel() {
    }

    public UserModel(String username, String email, String phNo, double lat, double lng) {
        this.username = username;
        this.email = email;
        this.phNo = phNo;
        this.lat = lat;
        this.lng = lng;
    }

    public UserModel(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
