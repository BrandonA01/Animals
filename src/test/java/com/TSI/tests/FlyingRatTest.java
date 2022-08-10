package com.TSI.tests;
import com.TSI.FlyingRat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyingRatTest {
    @Test
    public void test_pigeon_eats(){
        FlyingRat frTest = new FlyingRat(true, 4, "Grey", 120);
        assertEquals("Pecks at Greggs Pasty", frTest.eat(), "Can't eat pasty");
    }
    @Test
    public void test_pigeon_set_pasties(){
        FlyingRat frTest = new FlyingRat(true, "Grey");
        frTest.setPasties_eaten(5000);
        assertEquals(5000, frTest.getPasties_eaten(), "Can't eat pasty");    }
    @Test
    public void test_pigeon_flying(){
        FlyingRat frTest = new FlyingRat(true, 4, "Grey");
        assertEquals("Flapping", frTest.takeOff(), "Not taking off");
        assertEquals("Gliding", frTest.flying(), "Not flying");
        assertEquals("Landed", frTest.land(), "Still Flying");
    }
    @Test
    public void test_pigeon_breathe(){
        FlyingRat frTest = new FlyingRat(true, 4, "Grey");
        assertEquals("Breathing...", frTest.breathe(), "Not breathing");
    }
}