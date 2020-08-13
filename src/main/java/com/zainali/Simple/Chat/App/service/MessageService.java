package com.zainali.Simple.Chat.App.service;

import com.zainali.Simple.Chat.App.model.ChatForm;
import com.zainali.Simple.Chat.App.model.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private List<String> messages;

    public MessageService(){
        this.messages = new ArrayList<>();
    }

    public void addMessage(ChatForm chatForm){
        ChatMessage chat = new ChatMessage();
        if(chatForm.getMessageEffect().equals("shout")){
            chat.setMessage(chatForm.getMessage().toUpperCase());
        }else if(chatForm.getMessageEffect().equals("whisper")){
            chat.setMessage(chatForm.getMessage().toLowerCase());
        }else {
            chat.setMessage(chatForm.getMessage());
        }

        messages.add(chat.getMessage());
    }

    public List<String> getMessages() {
        return new ArrayList<>(this.messages);
    }

    public int messageCount(){
        return messages.size();
    }

}
