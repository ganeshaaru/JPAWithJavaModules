package com.r.service;

import com.r.persistence.dao.DAO;
import com.r.persistence.entity.MessageEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService.class);
    @Autowired
    private DAO DAO;

    public void getMessages(){
        DAO.getMessages().forEach(messageEntity -> {
            LOGGER.info(messageEntity.getText());
        });

    }

    public MessageEntity createMessage(String message){
        MessageEntity entity = DAO.createMessage(message);

        MessageEntity messageEntity = DAO.loadMessage(entity.getId());
        return messageEntity;
    }
}
