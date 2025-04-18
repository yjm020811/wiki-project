package com.example.demo.Entity;

public class User {
    private int user_id;
    private String user_name;
    private String email;
    private  String registration_date;
    private  String last_login;
    private  String profile_picture_url;
    private String bio;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public String getProfile_picture_url() {
        return profile_picture_url;
    }

    public void setProfile_picture_url(String profile_picture_url) {
        this.profile_picture_url = profile_picture_url;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public User(int user_id, String user_name, String email, String registration_date, String last_login, String profile_picture_url, String bio) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.registration_date = registration_date;
        this.last_login = last_login;
        this.profile_picture_url = profile_picture_url;
        this.bio = bio;
    }
}
