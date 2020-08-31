package com.r.service.jpa.mappings;

import com.r.persistence.dao.DAO;
import com.r.persistence.entity.ActorEntity;
import com.r.persistence.entity.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ManyToManyMapping {

    @Autowired
    private DAO dao;

    @Transactional
    public void createManyToManyMappings(){
        MovieEntity msDhoni = new MovieEntity();
        msDhoni.setMovieName("msDhoni");
        MovieEntity dilBechara = new MovieEntity();
        dilBechara.setMovieName("dilBechara");

        ActorEntity sushantSingh = new ActorEntity();
        sushantSingh.setActorName("sushantSingh");
        ActorEntity sanjanaSanghi = new ActorEntity();
        sanjanaSanghi.setActorName("sanjanaSanghi");

        dilBechara.getActors().add(sanjanaSanghi);
        dilBechara.getActors().add(sushantSingh);

        msDhoni.getActors().add(sushantSingh);

        dao.saveMovie(msDhoni);
        dao.saveMovie(dilBechara);
    }
}
