package com.zainali.Simple.Chat.App.Controller;

import com.zainali.Simple.Chat.App.Model.ChatForm;
import com.zainali.Simple.Chat.App.Model.ChatMessage;
import com.zainali.Simple.Chat.App.Service.MessageService;
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
