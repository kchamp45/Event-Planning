package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Events {
    private int numOfGuests;
    private int foodPrice;
    private int beveragePrice;
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


    public int numOfGuests(int input) {
        return input;
    }

    public String foodSelection (String foodie) {
            return foodie;
        }

    public int foodPrice(String inputFoodChoice) {
        food.put("no food", 0);
        food.put("hor derves", 5);
        food.put("dinner", 10);
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

    public int beveragePrice(String inputBeverageChoice) {
        beverage.put("water", 0);
        beverage.put("soda", 5);
        beverage.put("alcohol", 20);
        if(inputBeverageChoice.equals("water")) {
            beveragePrice = beverage.get("water");
        } else if (inputBeverageChoice.equals("hor derves")) {
            beveragePrice  = beverage.get("hor derves");
        } else if (inputBeverageChoice.equals("dinner")) {
            beveragePrice  = beverage.get("dinner");
        } else {
            System.out.println("Please enter a valid beverage choice.");
        }
        return beveragePrice;
    }

    public int entertainmentPrice(String inputEntertainmentChoice) {
        entertainment.put("bad singer", 0);
        entertainment.put("dj", 500);
        entertainment.put("live band", 1000);
        if(inputEntertainmentChoice.equals("bad singer")) {
            entertainmentPrice = entertainment.get("bad singer");
        } else if (inputEntertainmentChoice.equals("dj")) {
            entertainmentPrice  = entertainment.get("dj");
        } else if (inputEntertainmentChoice.equals("live band")) {
            entertainmentPrice  = entertainment.get("live band");
        } else {
            System.out.println("Please enter a valid entertainment choice.");
        }
        return entertainmentPrice;
    }

    public int costOfEvent(int guest, String foodie, String drink, String fun) {
        int totalCost = 0;
        return totalCost += (foodPrice * numOfGuests) + (beveragePrice * numOfGuests) + entertainmentPrice;
    }



}
