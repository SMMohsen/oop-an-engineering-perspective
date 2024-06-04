package oop.service;

import oop.model.reservation.Reservation;

public class CheckoutService {

  public double checkoutReservation(Reservation reservation) {

    double totalAmount = reservation.calculateTotalAmount();

    reservation.getRoom().freeRoom();

    return totalAmount;
  }
}
