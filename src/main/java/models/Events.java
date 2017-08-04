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

    private ArrayList<String>food;
    private ArrayList<String>beverages;
    private ArrayList<String>entertainments;

    public Events() {
        Map<String, Integer> food = new HashMap<String, Integer>();
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
        return 0;

    }
    public ArrayList<String> getFood() {
        return food;
    }
}
