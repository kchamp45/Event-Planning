package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/4/17.
 */
public class Events {
    private int numOfGuests;
    private ArrayList<String>food;
    private ArrayList<String>beverages;
    private ArrayList<String>entertainments;

    public int numOfGuests(int input) {
        return input;
    }
    public String foodSelection (String foodie) {
        List<String>food = new ArrayList<String>();
        food.add("no food");
        return food.get(0);
    }
}
