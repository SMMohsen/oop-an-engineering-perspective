package oop.management;

import oop.db.DataStore;
import oop.model.Order;

public class OrderManagement {

  private DataStore dataStore;

  public OrderManagement(DataStore dataStore) {

    this.dataStore = dataStore;
  }

  public void createOrder(Order order) {

    this.dataStore.getOrders().add(order);
  }

}
