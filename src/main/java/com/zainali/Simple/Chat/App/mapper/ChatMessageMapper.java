package com.zainali.Simple.Chat.App.mapper;

import com.zainali.Simple.Chat.App.model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChatMessageMapper {
    @Select("SELECT * FROM MESSAGES")
    List<ChatMessage> getChatMessage();

    @Insert("INSERT INTO MESSAGES (userName, message) VALUES(#{userName}, #{message})")
    @Options(useGeneratedKeys = true, keyProperty = "messageid")
    Integer insert(ChatMessage chatMessage);
}
