package com.zainali.Simple.Chat.App.Model;

import com.sun.jdi.request.StepRequest;

public class ChatMessage {
    private String userName;
    private String message;

    public ChatMessage(String userName, String message){
        this.userName = userName;
        this.message = message;
    }

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