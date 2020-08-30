package com.r.service;

import com.r.persistence.dao.MessageDAO;
import com.r.persistence.entity.MessageEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService.class);
    @Autowired
    private MessageDAO messageDAO;

    public void getMessages(){
        messageDAO.getMessages().forEach(messageEntity -> {
            LOGGER.info(messageEntity.getText());
        });

    }

    public MessageEntity createMessage(String message){
        MessageEntity entity = messageDAO.createMessage(message);

        MessageEntity messageEntity = messageDAO.loadMessage(entity.getId());
        return messageEntity;
    }
}
