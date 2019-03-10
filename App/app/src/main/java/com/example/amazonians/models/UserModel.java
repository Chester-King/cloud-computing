package com.example.amazonians.models;

public class UserModel {

    private String username;
    private String email;
    private double lat;
    private double lng;

    public UserModel() {
    }

    public UserModel(String username, String email, double lat, double lng) {
        this.username = username;
        this.email = email;
        this.lat = lat;
        this.lng = lng;
    }

    public UserModel(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
