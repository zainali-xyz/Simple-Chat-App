package com.zainali.Simple.Chat.App;

import com.sun.jdi.request.StepRequest;

public class ChatMessage {
    String userName;
    String message;

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
