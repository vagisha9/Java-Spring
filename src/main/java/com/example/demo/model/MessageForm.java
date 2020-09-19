package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class MessageForm {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
