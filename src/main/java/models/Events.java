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
    private int discount;
    private int cost;

    Map<String, Integer> food = new HashMap<String, Integer>();
    Map<String, Integer> beverage = new HashMap<String, Integer>();
    Map<String, Integer> entertainment = new HashMap<String, Integer>();
    Map<String, Integer> coupon = new HashMap<String, Integer>();

    public int numOfGuests(int guestNum) {
        return guestNum;
    }

    public String foodSelection (String foodie) {
            return foodie;
        }

    public int foodCost(String inputFoodChoice) {
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

    public int beverageCost(String inputBeverageChoice) {
        beverage.put("water", 0);
        beverage.put("soda", 5);
        beverage.put("alcohol", 20);
        if(inputBeverageChoice.equals("water")) {
            beveragePrice = beverage.get("water");
        } else if (inputBeverageChoice.equals("soda")) {
            beveragePrice  = beverage.get("soda");
        } else if (inputBeverageChoice.equals("alcohol")) {
            beveragePrice  = beverage.get("alcohol");
        } else {
            System.out.println("Please enter a valid beverage choice.");
        }
        return beveragePrice;
    }

    public int entertainmentCost(String inputEntertainmentChoice) {
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

    public int priceBreak (String couponCode) {
        coupon.put("CHEAP", 100);
        coupon.put("DUD2017", 200);

        if (couponCode.equals("CHEAP")) {
            discount = coupon.get("CHEAP");
        } else if (couponCode.equals("DUD2017")) {
            discount = beverage.get("DUD2017");
        } else {
            discount = 0;
        }
         return discount;
    }

    public int multiFoodPrice(int guestNum, String foodie) {
        int groupFoodPrice = 0;
        foodCost(foodie);
        return groupFoodPrice = foodCost(foodie) * guestNum;
    }

    public int costOfEvent(int guestNum, String foodie, String drink, String fun) {
        int totalCost = 0;
        return totalCost = (foodCost(foodie) * guestNum) + (beverageCost(drink) * guestNum) + entertainmentCost(fun);

    }

    public boolean toApplyCoupon(int guests) {
        return guests >= 150;
    }

    public int costAfterCoupon(int guestNum, String foodie, String drink, String fun, String couponCode) {
        int totalAfterDiscount = 0;
        return totalAfterDiscount = (foodCost(foodie) * guestNum) + (beverageCost(drink) * guestNum) + entertainmentCost(fun) - priceBreak(couponCode);
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public int getFoodPrice() {

        return foodPrice;
    }

    public int getBeveragePrice() {
        return beveragePrice;
    }

    public int getEntertainmentPrice() {
        return entertainmentPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public Map<String, Integer> getFood() {
        return food;
    }

    public Map<String, Integer> getBeverage() {
        return beverage;
    }

    public Map<String, Integer> getEntertainment() {
        return entertainment;
    }

    public Map<String, Integer> getCoupon() {
        return coupon;
    }
}
