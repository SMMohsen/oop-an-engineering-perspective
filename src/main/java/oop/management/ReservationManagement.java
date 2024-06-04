package oop.management;

import oop.db.DataStore;
import oop.model.reservation.Reservation;

public class ReservationManagement {

  private DataStore dataStore;

  public ReservationManagement(DataStore dataStore) {

    this.dataStore = dataStore;
  }

  public void createReservation(Reservation reservation) {

    reservation.getRoom().reserveRoom();
    this.dataStore.getReservations().add(reservation);
  }
}
