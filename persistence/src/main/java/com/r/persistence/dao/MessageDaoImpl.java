package com.r.persistence.dao;

import com.r.persistence.entity.MessageEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class MessageDaoImpl implements MessageDAO {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<MessageEntity> getMessages() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<MessageEntity> mq = builder.createQuery(MessageEntity.class);
        Root<MessageEntity> from = mq.from(MessageEntity.class);
        CriteriaQuery<MessageEntity> selectAll = mq.select(from);

        TypedQuery<MessageEntity> query = entityManager.createQuery(selectAll);
        return  query.getResultList();
    }

    @Override
    @Transactional
    public MessageEntity createMessage(String message) {

        MessageEntity entity =  new MessageEntity();
        entity.setText(message);
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public MessageEntity loadMessage(Long id) {
        return entityManager.find(MessageEntity.class, id);
    }
}
