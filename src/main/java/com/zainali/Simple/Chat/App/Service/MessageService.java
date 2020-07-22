package com.zainali.Simple.Chat.App.Service;

import com.zainali.Simple.Chat.App.Model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private List<ChatMessage> messages;

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

    public int messageCount(){
        return messages.size();
    }

}
