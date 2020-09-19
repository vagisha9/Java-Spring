package com.example.demo.service;

import com.example.demo.mapper.MessageMapper;
import com.example.demo.model.ChatForm;
import com.example.demo.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private MessageMapper messageMapper;

    public MessageService(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    public void addMessage(ChatForm chatForm){
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());
        switch (chatForm.getMessageType()){
            case "Say":
                newMessage.setMessage(chatForm.getMessageText());
                break;
            case "Shout":
                newMessage.setMessage(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                newMessage.setMessage(chatForm.getMessageText().toLowerCase());
                break;
        }
        this.messageMapper.addMessage(newMessage);
    }

    public List<ChatMessage> getChatMessages(){
        return messageMapper.getAllMessages();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating message service bean");
    }
}
