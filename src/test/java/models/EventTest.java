package models;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

import java.util.ArrayList;

/**
 * Created by Guest on 8/4/17.
 */
public class EventTest {

    @Test
    public void createEvent_InstantiateCorrectly() throws Exception {
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void numOfGuests_storesUserInput_true() throws Exception {
        Event testEvent = new Event();
        assertEquals(1, testEvent.numOfGuests(1));
    }

    @Test
    public void foodSelection_returnFoodSelected_input() throws Exception {
        Event testEvent = new Event();
        assertEquals("no food", testEvent.foodSelection("no food"));
    }

    @Test
    public void foodCost_returnPriceOfFoodSelected() {
        Event testEvent = new Event();
        assertEquals(10, testEvent.foodCost("dinner"));
    }

    @Test
    public void multiFoodPrice_returnFoodPriceBasedOnNumOfGuests() {
        Event testEvent = new Event();
        assertEquals(20, testEvent.multiFoodPrice(2, "dinner"));
    }

    @Test
    public void costOfEvent_returnTotalCost()  {
        Event testEvent = new Event();
        assertEquals(550, testEvent.costOfEvent(10, "no food", "soda", "dj"));
    }

    @Test
    public void priceBreak_returnDiscountAmount()  {
        Event testEvent = new Event();
        assertEquals(100, testEvent.priceBreak("CHEAP"));
    }

    @Test
    public void costAfterCoupon_returnTotalCostAfterCoupon() {
        Event testEvent = new Event();
        assertEquals(450, testEvent.costAfterCoupon(10, "no food", "soda", "dj", "CHEAP"));
    }
}