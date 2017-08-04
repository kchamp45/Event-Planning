package models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

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
    public void foodSelection_returnFoodSelected_ArrayList();
        Events testEvent = new Events();
        ArrayList<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testEvent.foodSelection("dinner"));

}