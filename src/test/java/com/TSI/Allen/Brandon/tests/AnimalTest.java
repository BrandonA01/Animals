package com.TSI.Allen.Brandon.tests;

import com.TSI.Allen.Brandon.Bat;
import com.TSI.Allen.Brandon.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    @Test
    public void get_animal_moving(){
        Bat testBat = new Bat(true, "Black");
        assertEquals("Moving", testBat.move(), "Not moving, maybe dead?");
        testBat.die();
        assertEquals("Not Moving", testBat.move(), "IT'S MOVING! Zombie Bats.");
    }
    @Test
    public void test_is_animal_alive(){
        Bat testBat = new Bat(true, 4, "Black");
        assertTrue(testBat.isAlive(), "It is dead");
        testBat.die();
        assertFalse(testBat.isAlive(), "It is alive");
    }
    @Test
    public void test_get_animal_age(){
        Bat testBat = new Bat(true, 4, "Black");
        assertEquals(4, testBat.getAge(), "Not the same age");
    }
    @Test
    public void test_get_animal_colour(){
        Bat testBat = new Bat(true, 4, "Black");
        assertEquals("Black", testBat.getColour(), "Not the same colour");
    }
    @Test
    public void test_animal_health(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        Cat testCat = new Cat(true, 3, "Ginger", "Ginger");
        testCat.attack(testBat);
        assertEquals(90, testBat.getHP(), "Bat is invincible");
    }
}
