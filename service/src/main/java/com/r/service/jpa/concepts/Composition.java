package com.r.service.jpa.concepts;

import java.util.ArrayList;
import java.util.List;

/*
*  Composition is strong form of aggregation, When an object contains the other object,
*    if the contained object cannot exist without the existence of container object, then it is called composition.
*
*   Explanation:
*   House contains multiples rooms, when house gets destroyed, all the rooms within the house also gets destroyed.
*   Room can not exists on its own and never be shared between other houses.
*
* */
public class Composition {

  public static void main(String[] args) {

      // House is constructed
        House neighboursHouse =  new House();

        // Rooms are added or built
      neighboursHouse.addRoom("Hall");
      neighboursHouse.addRoom("Kitchen");
      neighboursHouse.addRoom("Bedroom");

      // House gets destroyed, all rooms associated to the house also gets destroyed. This type of relation between objects House and Room is called Composition
      neighboursHouse = null;
  }

    static class House{
        List<Room> rooms;

        public House() {
            rooms = new ArrayList<>();
        }

        public void addRoom(String type){
            this.rooms.add(new Room(type));
        }

        class Room{
            String type;

            public Room(String type) {
                this.type = type;
            }
        }
    }


}
