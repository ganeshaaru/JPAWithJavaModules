package com.r.persistence.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Movie")
public class MovieEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "movie_name")
  private String movieName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "movie_actor",
            joinColumns = {@JoinColumn(name = "movie_id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id")}
    )
  private List<ActorEntity> actors;

    public MovieEntity() {
        this.actors =  new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public List<ActorEntity> getActors() {
        return actors;
    }

    public void setActors(List<ActorEntity> actors) {
        this.actors = actors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieEntity that = (MovieEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(movieName, that.movieName) &&
                Objects.equals(actors, that.actors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movieName, actors);
    }
}
