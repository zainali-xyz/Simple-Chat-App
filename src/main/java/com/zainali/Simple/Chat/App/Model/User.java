package com.zainali.Simple.Chat.App.Model;

public class User {
    private Integer userid;
    private String username;
    private String VARCHAR;
    private String password;
    private String firstname;
    private String lastname;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVARCHAR() {
        return VARCHAR;
    }

    public void setVARCHAR(String VARCHAR) {
        this.VARCHAR = VARCHAR;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
