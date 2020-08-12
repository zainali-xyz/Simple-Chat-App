package com.zainali.Simple.Chat.App.service;

import com.zainali.Simple.Chat.App.model.ChatForm;
import com.zainali.Simple.Chat.App.model.ChatMessage;
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

    public void addMessage(ChatForm chatForm){
        ChatMessage chat = new ChatMessage();
        chat.setUserName(chatForm.getUserName());
        if(chatForm.getMessageEffect().equals("shout")){
            chat.setMessage(chatForm.getMessage().toUpperCase());
        }else if(chatForm.getMessageEffect().equals("whisper")){
            chat.setMessage(chatForm.getMessage().toLowerCase());
        }else {
            chat.setMessage(chatForm.getMessage());
        }

        messages.add(chat);
    }

    public List<ChatMessage> getMessages() {
        return new ArrayList<>(this.messages);
    }

    public int messageCount(){
        return messages.size();
    }

}
