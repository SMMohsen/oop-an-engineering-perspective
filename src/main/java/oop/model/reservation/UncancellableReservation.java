package oop.model.reservation;

import oop.model.Customer;
import oop.model.room.Room;

import java.time.LocalDate;

public class UncancellableReservation extends Reservation {


  public UncancellableReservation(Room room, Customer customer, LocalDate reservationStartDate, LocalDate reservationEndDate) {
    super(room, customer, reservationStartDate, reservationEndDate);

  }

  @Override
  public double calculateRoomReservationAmount() {

    return getReservationStartDate().until(getReservationEndDate()).getDays() * getRoom().getPrice();
  }

}
