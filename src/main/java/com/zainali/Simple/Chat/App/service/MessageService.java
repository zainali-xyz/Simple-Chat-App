package com.zainali.Simple.Chat.App.service;

import com.zainali.Simple.Chat.App.mapper.ChatMessageMapper;
import com.zainali.Simple.Chat.App.model.ChatForm;
import com.zainali.Simple.Chat.App.model.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private ChatMessageMapper chatMessageMapper;

    public MessageService(ChatMessageMapper chatMessageMapper){
        this.chatMessageMapper = chatMessageMapper;
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

        chatMessageMapper.insert(chat);
    }

    public List<ChatMessage> getMessages() {
        return chatMessageMapper.getChatMessage();
    }

    public int messageCount(){
        return chatMessageMapper.getChatMessage().size();
    }

}
