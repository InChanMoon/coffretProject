package com.example.coffretproject.PasswordList;

import java.util.Date;

public class passwordList {

    String title;
    String siteURL;
    String ID;
    String pw;
    String date;

    public passwordList(String title, String siteURL, String ID, String pw, String date) {
        this.title = title;
        this.siteURL = siteURL;
        this.ID = ID;
        this.pw = pw;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSiteURL() {
        return siteURL;
    }

    public void setSiteURL(String siteURL) {
        this.siteURL = siteURL;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
