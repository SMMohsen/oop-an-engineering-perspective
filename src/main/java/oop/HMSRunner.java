package oop;

import oop.db.DataStore;
import oop.management.MenuManagement;
import oop.management.ReservationManagement;
import oop.management.RoomManagement;
import oop.management.abstraction.correct.MenuDataAccessManager;
import oop.management.abstraction.correct.RoomDataAccessManager;
import oop.model.reservation.CancelableReservation;
import oop.model.Customer;
import oop.model.room.DoubleRoom;
import oop.model.Meal;
import oop.model.Order;
import oop.model.reservation.Reservation;
import oop.model.room.SingleRoom;
import oop.model.room.SweetRoom;
import oop.service.CheckoutService;
import oop.util.ConsoleMenuDisplay;
import oop.util.ConsoleRoomDisplay;
import oop.util.MenuDisplay;
import oop.util.RoomDisplay;

import java.time.LocalDate;
import java.util.Scanner;


public class HMSRunner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);



    DataStore dataStore = new DataStore();
    RoomDataAccessManager roomManagement = new RoomManagement(dataStore);
    MenuDataAccessManager menuManagement = new MenuManagement(dataStore);
    ReservationManagement reservationManagement = new ReservationManagement(dataStore);


    roomManagement.addRoom(new DoubleRoom(1,  250.0));
    roomManagement.addRoom(new SingleRoom(2,  350.0));
    roomManagement.addRoom(new SweetRoom(3, 1000, "air conditioning - SPA - BLA BLA"));
    roomManagement.addRoom(new DoubleRoom(4,  200.0));

    menuManagement.addMeal(new Meal("rizo", "rice with meat", 300.0));
    menuManagement.addMeal(new Meal("pasto", "pasta with meat", 330.0));

    RoomDisplay roomDisplay = new ConsoleRoomDisplay();
    MenuDisplay menuDisplay = new ConsoleMenuDisplay();

    System.out.println("Program Start Press Enter to Process");

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get Available Rooms");
    System.out.println("========================================");

    scanner.nextLine();
    roomDisplay.displayRooms(roomManagement.getAvailableRooms());

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get All Meals");
    System.out.println("========================================");

    scanner.nextLine();
    menuDisplay.displayMeals(menuManagement.getAllMeals());

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Customer reserved Room 2 for 3 days");
    System.out.println("========================================");

    scanner.nextLine();
    Customer customer = new Customer("Ahmed", "1234");
    Reservation newReservation = new CancelableReservation
      (roomManagement.getRoomByNumber(2), customer, LocalDate.now(), LocalDate.now().plusDays(3));

    reservationManagement.createReservation(newReservation);


    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get Available Rooms After Reservation");
    System.out.println("========================================");


    scanner.nextLine();
    roomDisplay.displayRooms(roomManagement.getAvailableRooms());

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Customer makes order with Rizo meal for room number 2");
    System.out.println("========================================");

    scanner.nextLine();
    Order customerOrder = new Order();
    customerOrder.addMeal(menuManagement.getMealByName("rizo"));
    newReservation.setOrder(customerOrder);

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Checkout Room");
    System.out.println("========================================");

    scanner.nextLine();
    CheckoutService checkoutService = new CheckoutService();
    double totalAmount = checkoutService.checkoutReservation(newReservation);

    System.out.println("Thanks Mr/ " + customer.getCustomerName() + " your total amount is " + totalAmount + " EGP");

    scanner.nextLine();
    System.out.println("========================================");
    System.out.println("Get Available Rooms After checkout");
    System.out.println("========================================");

    scanner.nextLine();
    roomDisplay.displayRooms(roomManagement.getAvailableRooms());


  }
}
