package shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FridgeTest {

    @Test
    void getLiter() {
        Fridge frigo = new Fridge("Beko", "Super Frigo", 900, 800, true);
        assertTrue(frigo.getLiter() == 900);
    }

    @Test
    void isFreezer() {
        Fridge frigo = new Fridge("Beko", "Super Frigo", 900, 800, true);
        assertTrue(frigo.isFreezer() == true);
    }

    @Test
    void isNotFreezer() {
        Fridge frigo = new Fridge("Beko", "Super Frigo", 900, 800, true);
        assertFalse(frigo.isFreezer() == true);
    }

}