package com.example.demo.mapper;

import com.example.demo.model.ChatMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM MESSAGES")
    List<ChatMessage> getAllMessages();

    @Select("INSERT INTO MESSAGES (username,messagetext) VALUES(#{username}, #{messagetext})")
    @Options(useGeneratedKeys = true,keyProperty = "messageId")
    int addMessage(ChatMessage chatMessage);
}
