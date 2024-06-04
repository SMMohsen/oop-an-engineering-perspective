package oop.management.abstraction.correct;

import oop.model.room.Room;

import java.util.List;

public interface RoomDataAccessManager {

  void removeRoom(int roomNumber);

  void addRoom(Room newRoom);

  List<Room> getAvailableRooms();

  Room getRoomByNumber(int roomNumber);
}
