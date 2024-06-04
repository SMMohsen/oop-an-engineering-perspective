package oop.util;

import oop.model.Meal;
import oop.model.Menu;

import java.util.List;

public class ConsoleMenuDisplay implements MenuDisplay {

  @Override
  public void displayMeals(List<Meal> meals) {


      System.out.println("name" + "    " + "description" + "         " + "price");

      for(Meal meal : meals) {

        System.out.println(meal.getName() + "\t" + meal.getDescription() + "\t\t" + meal.getPrice());
      }

  }
}
