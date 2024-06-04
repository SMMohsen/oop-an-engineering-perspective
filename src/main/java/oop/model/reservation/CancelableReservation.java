package oop.model.reservation;

import oop.model.Customer;
import oop.model.room.Room;

import java.time.LocalDate;

public class CancelableReservation extends Reservation {


  private String cancelReason;

  private double cancellationFee = 0.33;

  public CancelableReservation(Room room, Customer customer, LocalDate reservationStartDate, LocalDate reservationEndDate) {
    super(room, customer, reservationStartDate, reservationEndDate);
  }

  @Override
  public double calculateRoomReservationAmount() {


    double roomReservationAmount = getReservationStartDate().until(getReservationEndDate()).getDays() * getRoom().getPrice();

    return roomReservationAmount + (roomReservationAmount * cancellationFee);
  }

  public String getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }

  public double getCancellationFee() {
    return cancellationFee;
  }

  public void setCancellationFee(double cancellationFee) {
    this.cancellationFee = cancellationFee;
  }


}
