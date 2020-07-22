package com.zainali.Simple.Chat.App;

public class ChatForm {
    private String message;
    private String userName;

    public void setMessage(String message){
        this.message = message;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getMessage(){
        return message;
    }

    public String getUserName(){
        return userName;
    }
}