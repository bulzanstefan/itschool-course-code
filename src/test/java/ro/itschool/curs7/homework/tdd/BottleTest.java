package ro.itschool.curs7.homework.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleTest {

    @Test
    @DisplayName("WHEN there is no available liquid THEN false is returned")
    void returnNoAvailableLiquid() {
        Bottle bottle = new Bottle(500, 0);

        boolean result = bottle.hasMoreLiquid();

        assertFalse(result);
    }

    @Test
    @DisplayName("WHEN there is available liquid THEN true is returned")
    void returnAvailableLiquid() {
        Bottle bottle = new Bottle(500, 100);

        boolean result = bottle.hasMoreLiquid();

        assertTrue(result);
    }

    @Test
    @DisplayName("WHEN the available liquid is negative THEN the constructor fails")
    void negativeAvailable() {
        try {
            new Bottle(500, -100);
        } catch (RuntimeException exception) {
            assertEquals(exception.getMessage(), "You cannot have negative availability");
        }
    }

}