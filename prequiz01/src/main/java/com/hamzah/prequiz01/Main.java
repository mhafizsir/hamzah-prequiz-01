package com.hamzah.prequiz01;

import com.hamzah.prequiz01.property.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

  public static void main(String[] args) {

    List<Registry> registries = new ArrayList<>();

    var hotelStandard = new Hotel();
    hotelStandard.setRoomType(RoomTypes.STANDARD);
    hotelStandard.setPrice(400000);

    var hotelDeluxe = new Hotel();
    hotelDeluxe.setPrice(600000);
    hotelDeluxe.setRoomType(RoomTypes.DELUXE);

    var apartment = new Apartment();
    apartment.setRoomCount(2);
    apartment.setPrice(700000);

    var homestay = new Homestay();
    homestay.setPrice(150000);

    var userA = new Users();
    userA.setName("User A");
    userA.setPhone("1234567890");

    var userB = new Users();
    userB.setName("User B");
    userB.setPhone("1234567890");

    var registry = new Registry();
    registry.setProperty(hotelStandard);
    registry.setUnit(10);
    registry.setUser(userA);
    registries.add(registry);

    registry = new Registry();
    registry.setUser(userA);
    registry.setUnit(3);
    registry.setProperty(hotelDeluxe);
    registries.add(registry);

    registry = new Registry();
    registry.setProperty(apartment);
    registry.setUser(userB);
    registry.setUnit(3);
    registries.add(registry);

    registry = new Registry();
    registry.setProperty(homestay);
    registry.setUser(userB);
    registry.setUnit(5);
    registries.add(registry);

    for(Registry r : registries) {
      System.out.println(r);
    }
  }
}
