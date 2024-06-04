package oop.management.cloud;

import oop.management.abstraction.correct.MenuDataAccessManager;
import oop.model.Meal;

import java.util.List;

// dummy cloud data access logic class
public class MenuCloudDataAccess implements MenuDataAccessManager {


  @Override
  public void removeMeal(String name) {
    System.out.println("menu removed from cloud");
  }

  @Override
  public void addMeal(Meal meal) {
    System.out.println("menu added to cloud");
  }

  @Override
  public List<Meal> getAllMeals() {
    return null;
  }

  @Override
  public Meal getMealByName(String mealName) {
    return null;
  }
}
