package com.zainali.Simple.Chat.App;

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
        if(messageEffect.equals("shout")){
            return message.toUpperCase();
        }else if(messageEffect.equals("whisper")){
            return message.toLowerCase();
        }

        return message;
    }

    public String getUserName(){
        if(messageEffect.equals("shout")){
            return userName.toUpperCase();
        }else if(messageEffect.equals("whisper")){
            return userName.toLowerCase();
        }

        return userName;
    }

    public String getMessageEffect(){
        return messageEffect;
    }
}