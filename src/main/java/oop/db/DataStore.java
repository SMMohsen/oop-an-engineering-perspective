package oop.db;




import oop.model.Customer;
import oop.model.Menu;
import oop.model.Order;
import oop.model.reservation.Reservation;
import oop.model.room.Room;


import java.util.ArrayList;
import java.util.List;

public class DataStore {

  private List<Room> rooms = new ArrayList<>();

  private Menu menu = new Menu();

  private List<Reservation> reservations = new ArrayList<>();

  private List<Customer> customers = new ArrayList<>();

  private List<Order> orders = new ArrayList<>();



  public List<Room> getRooms() {
    return rooms;
  }

  public void setRooms(List<Room> rooms) {
    this.rooms = rooms;
  }

  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }
}
