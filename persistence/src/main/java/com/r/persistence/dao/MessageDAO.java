package com.r.persistence.dao;

import com.r.persistence.entity.MessageEntity;

import java.util.List;

public interface MessageDAO {

    List<MessageEntity> getMessages();

    MessageEntity createMessage(String message);

    MessageEntity loadMessage(Long id);
}
