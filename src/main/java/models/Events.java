package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Guest on 8/4/17.
 */
public class Events {
    private int numOfGuests;
    private int foodPrice;
    private ArrayList<String>beverages;
    private ArrayList<String>entertainments;

    Map<String, Integer> food = new HashMap<String, Integer>();

    public Events() {
        food.put("no food", 0);
        food.put("hor derves", 100);
        food.put("dinner", 200);
    }


    public int numOfGuests(int input) {
        return input;
    }

    public String foodSelection (String foodie) {
            return foodie;
        }

    public int foodPrice(String inputFoodChoice) {
        if(inputFoodChoice.equals("no food")) {
            foodPrice = food.get("no food");
        }
    return foodPrice;
    }


}
