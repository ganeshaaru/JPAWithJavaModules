package com.r.service.jpa.concepts;

import java.util.ArrayList;
import java.util.List;
/*
 *     Official Definition of Aggregation
 *
 *     Aggregation is a special case of association. A directional association between objects.
 *     When an object ‘has-a’ another object, then you have got an aggregation between them.
 *     Direction between them specified which object contains the other object. Aggregation is also called a “Has-a” relationship.
 *
 *     Explanation :
 *     Music Band has a group of artists. in other words, Band object is an aggregation of artists. But, when Bands get destroyed, Artists will still exists,
 *     Artist can become actor, singer and even, start a new music band.
 *
 *     This type of relation is called as "Aggregation"
 * */
public class Aggregation {

  public static void main(String[] args) {
    //  Lets assume we have two Artists created
    Artist adhi = new Artist("Adhi");
    Artist jeeva = new Artist("Jeeva");

    // Two artists joins and creates a Music Band
    Band hipHopTamizha = new Band();
    hipHopTamizha.artists = new ArrayList<>();
    hipHopTamizha.artists.add(adhi);
    hipHopTamizha.artists.add(jeeva);

    //after sometime due to conflicts Band gets destroyed
    hipHopTamizha = null;

    //Individual Artists does not gets destroyed. but, they still exists and joins movies, become actors and singers.
    Movie meesayaMurukku = new Movie();
    meesayaMurukku.singers = new ArrayList<>();
    meesayaMurukku.actors = new ArrayList<>();

    meesayaMurukku.singers.add(adhi); // movie singer
    meesayaMurukku.actors.add(adhi); // becomes a hero

    /*
    *   This type of relation or association between objects Band and Artist  is called Aggregation
    * */
  }

  static class Movie {
    List<Artist> singers;
    List<Artist> actors;
  }

  static class Band {
    List<Artist> artists;
  }

  static class Artist {
    String name;

    public Artist(String name) {
      this.name = name;
    }
  }
}
