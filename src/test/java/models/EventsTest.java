package models;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

import java.util.ArrayList;

/**
 * Created by Guest on 8/4/17.
 */
public class EventsTest {

    @Test
    public void createEvent_InstantiateCorrectly() throws Exception {
        Events testEvent = new Events();
        assertEquals(true, testEvent instanceof Events);
    }

    @Test
    public void numOfGuests_storesUserInput_true() throws Exception {
        Events testEvent = new Events();
        assertEquals(1, testEvent.numOfGuests(1));
    }

    @Test
    public void foodSelection_returnFoodSelected_input() throws Exception {
        Events testEvent = new Events();
        assertEquals("no food", testEvent.foodSelection("no food"));
    }

    @Test
    public void foodCost_returnPriceOfFoodSelected() {
        Events testEvent = new Events();
        assertEquals(10, testEvent.foodCost("dinner"));
    }

    @Test
    public void multiFoodPrice_returnFoodPriceBasedOnNumOfGuests() {
        Events testEvent = new Events();
        assertEquals(10, testEvent.multiFoodPrice(2, "dinner"));
    }

    @Test
    public void costOfEvent_returnTotalCost()  {
        Events testEvent = new Events();
        assertEquals(550, testEvent.costOfEvent(10, "no food", "soda", "dj"));
    }

    @Test
    public void discount_returnDiscountAmount()  {
        Events testEvent = new Events();
        assertEquals(100, testEvent.priceBreak("CHEAP"));
    }

    @Test
    public void costAfterCoupon_returnTotalCostAfterCoupon() {
        Events testEvent = new Events();
        assertEquals(0, testEvent.costAfterCoupon(10, "no food", "soda", "dj", "CHEAP"));
    }
}