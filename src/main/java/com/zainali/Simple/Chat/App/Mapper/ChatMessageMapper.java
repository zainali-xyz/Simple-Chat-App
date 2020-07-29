package com.zainali.Simple.Chat.App.Mapper;

import com.zainali.Simple.Chat.App.Model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ChatMessageMapper {
    @Select("SELECT * FROM MESSAGES WHERE messageid = #{messageid}")
    ChatMessage getChatMessage(Integer messageid);

    @Insert("INSERT INTO MESSAGES (userName, message) VALUES(#{userName}, #{message})")
    @Options(useGeneratedKeys = true, keyProperty = "messageid")
    Integer insert(ChatMessage chatMessage);
}
