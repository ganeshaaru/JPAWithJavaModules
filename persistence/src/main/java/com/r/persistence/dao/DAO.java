package com.r.persistence.dao;

import com.r.persistence.entity.GuideEntity;
import com.r.persistence.entity.MessageEntity;
import com.r.persistence.entity.MovieEntity;
import com.r.persistence.entity.StudentEntity;

import java.util.List;

public interface DAO {

    List<MessageEntity> getMessages();

    MessageEntity createMessage(String message);

    MessageEntity loadMessage(Long id);

    StudentEntity saveStudent(StudentEntity student);

    StudentEntity loadStudent(Long id);

    GuideEntity saveGuide(GuideEntity guide);

    GuideEntity loadGuide(Long id);

    MovieEntity saveMovie(MovieEntity movie);
}
