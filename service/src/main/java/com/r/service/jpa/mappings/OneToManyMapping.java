package com.r.service.jpa.mappings;

import com.r.persistence.dao.DAO;
import com.r.persistence.entity.GuideEntity;
import com.r.persistence.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OneToManyMapping {

    @Autowired
    DAO dao;


    public  void createTwoStudentsAndOneGuide(){
        GuideEntity guide = new GuideEntity();
        guide.setGuideName("Dhoni");

        StudentEntity student = new StudentEntity();
        student.setName("Kholi");
        student.setGuideEntity(guide);
        StudentEntity student2 = new StudentEntity();
        student2.setName("Rohit");
        student2.setGuideEntity(guide);

        guide.getStudents().add(student);
        guide.getStudents().add(student2);

        dao.saveGuide(guide);


    }
}
