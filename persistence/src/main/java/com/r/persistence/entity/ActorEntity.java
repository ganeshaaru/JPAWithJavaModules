package com.r.persistence.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Actor")
public class ActorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "actor_name")
    private String actorName;

    @ManyToMany(mappedBy = "actors")
    private List<MovieEntity> movies;

    public ActorEntity() {
       this.movies = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public List<MovieEntity> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieEntity> movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorEntity that = (ActorEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(actorName, that.actorName) &&
                Objects.equals(movies, that.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actorName, movies);
    }
}
