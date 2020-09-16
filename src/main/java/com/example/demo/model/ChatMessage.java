package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class ChatMessage {

    String username;
    String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
