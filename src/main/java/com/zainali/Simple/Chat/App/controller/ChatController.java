package com.zainali.Simple.Chat.App.controller;

import com.zainali.Simple.Chat.App.model.ChatForm;
import com.zainali.Simple.Chat.App.service.MessageService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    private MessageService messageService;

    public ChatController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping
    public String getChat(@ModelAttribute("newChat") ChatForm newChat, Model model){
        model.addAttribute("chats", this.messageService.getMessages());
        model.addAttribute("messageCount", messageService.messageCount());
        return "chat";
    }

    @PostMapping
    public String addChat(@ModelAttribute("newChat") ChatForm chatForm, Model model, Authentication authentication){
        chatForm.setUserName(authentication.getName());
        messageService.addMessage(chatForm);
        model.addAttribute("chats", messageService.getMessages());
        model.addAttribute("messageCount", messageService.messageCount());
        chatForm.setMessage("");
        return "chat";
    }

}
