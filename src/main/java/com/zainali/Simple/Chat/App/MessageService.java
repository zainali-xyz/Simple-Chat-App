package com.zainali.Simple.Chat.App;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
    List<ChatMessage> messages;

    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
    }

    public void addMessage(ChatMessage chatMessage){
        messages.add(chatMessage);
    }

    public List<ChatMessage> getMessages() {
        return new ArrayList<>(this.messages);
    }

}
