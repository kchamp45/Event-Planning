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
    public void foodSelection_returnFoodSelected_ArrayList() throws Exception {
        Events testEvent = new Events();
        ArrayList<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("no food");
        assertEquals(expectedOutput, testEvent.foodSelection("no food"));
    }

}