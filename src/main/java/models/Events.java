package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Events {
    private int numOfGuests;
    private int foodPrice;
    private int drinkPrice;
    private int entertainmentPrice;
    private int cost;

    public Events() {
        this.numOfGuests = numOfGuests;
        this.food = food;
        this.beverage = beverage;
        this.entertainment = entertainment;
        this.cost = cost;
    }
    Map<String, Integer> food = new HashMap<String, Integer>();
    Map<String, Integer> beverage = new HashMap<String, Integer>();
    Map<String, Integer> entertainment = new HashMap<String, Integer>();

//    public HashMap<String, Integer>() food() {
//        food.put("no food", 0);
//        food.put("hor derves", 100);
//        food.put("dinner", 200);
//    }
//        food;


//    public HashMap<String, Integer> beverage() {
//        beverage.put("water", 0);
//        beverage.put("soda", 50);
//        beverage.put("alcohol", 300);
//    }
//
//    public HashMap<String, Integer> entertainment() {
//        entertainment.put("clown", 0);
//        entertainment.put("dj", 500);
//        entertainment.put("live band", 1000);
//    }


    public int numOfGuests(int input) {
        return input;
    }

    public String foodSelection (String foodie) {
            return foodie;
        }

    public int foodPrice(String inputFoodChoice) {
        food.put("no food", 0);
        food.put("hor derves", 100);
        food.put("dinner", 200);
        if(inputFoodChoice.equals("no food")) {
            foodPrice = food.get("no food");
        } else if (inputFoodChoice.equals("hor derves")) {
            foodPrice = food.get("hor derves");
        } else if (inputFoodChoice.equals("dinner")) {
            foodPrice = food.get("dinner");
        } else {
            System.out.println("Please enter a valid food choice.");
        }
        return foodPrice;
    }

    public int costOfEvent(String foodie) {
        return 1;
    }



}
