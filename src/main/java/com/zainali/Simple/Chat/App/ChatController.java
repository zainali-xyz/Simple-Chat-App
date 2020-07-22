package com.zainali.Simple.Chat.App;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {
    private MessageService messageService;

    public ChatController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping("/chat")
    public String getChat(@ModelAttribute("newChat") ChatForm newChat, Model model){
        model.addAttribute("chats", this.messageService.getMessages());
        model.addAttribute("messageCount", messageService.messageCount());
        return "chat";
    }

    @PostMapping("/chat")
    public String addChat(@ModelAttribute("newChat") ChatForm chatForm, Model model) {
        ChatMessage chat = new ChatMessage(chatForm.getUserName(), chatForm.getMessage());
        messageService.addMessage(chat);
        model.addAttribute("chats", messageService.getMessages());
        model.addAttribute("messageCount", messageService.messageCount());
        chatForm.setMessage("");
        chatForm.setUserName("");
        return "chat";
    }

}
