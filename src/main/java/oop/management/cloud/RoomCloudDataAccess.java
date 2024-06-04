package oop.management.cloud;

import oop.management.abstraction.correct.RoomDataAccessManager;
import oop.model.room.Room;

import java.util.ArrayList;
import java.util.List;

// dummy cloud data access logic class
public class RoomCloudDataAccess implements RoomDataAccessManager {
  @Override
  public void removeRoom(int roomNumber) {
    System.out.println("room removed from cloud");
  }

  @Override
  public void addRoom(Room newRoom) {
    System.out.println("room added to cloud");
  }

  @Override
  public List<Room> getAvailableRooms() {
    return new ArrayList<>();
  }

  @Override
  public Room getRoomByNumber(int roomNumber) {
    return null;
  }
}
