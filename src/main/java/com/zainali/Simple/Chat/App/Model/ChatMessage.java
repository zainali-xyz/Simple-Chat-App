package com.zainali.Simple.Chat.App.Model;

import com.sun.jdi.request.StepRequest;

public class ChatMessage {
    private String userName;
    private String messageText;
    private Integer messageid;

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setMessageText(String messageText){
        this.messageText = messageText;
    }

    public String getUserName(){
        return userName;
    }

    public String getMessageText(){
        return messageText;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }
}
