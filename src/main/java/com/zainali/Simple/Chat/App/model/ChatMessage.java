package com.zainali.Simple.Chat.App.model;

public class ChatMessage {
    private String userName;
    private String message;
    private Integer messageid;

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getUserName(){
        return userName;
    }

    public String getMessage(){
        return message;
    }

}
