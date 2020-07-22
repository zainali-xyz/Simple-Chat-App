package com.zainali.Simple.Chat.App.Model;

public class ChatForm {
    private String message;
    private String userName;
    private String messageEffect = "";

    public void setMessage(String message){
        this.message = message;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setMessageEffect(String messageEffect){
        this.messageEffect = messageEffect;
    }

    public String getMessage(){
        return message;
    }

    public String getUserName(){
        return userName;
    }

    public String getMessageEffect(){
        return messageEffect;
    }
}