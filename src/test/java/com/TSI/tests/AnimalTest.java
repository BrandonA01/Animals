package com.TSI.tests;

import com.TSI.Animal;
import com.TSI.Bat;
import com.TSI.Cat;
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
    @Test
    public void test_animal_poop(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Pooping", testBat.poop(), "Bat is constipated");
    }
    @Test
    public void test_animal_sleep(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Sleeping", testBat.sleep(), "Bat cannot sleep");
    }
    @Test
    public void test_animal_setKills(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setKills(400);
        assertEquals(400, testBat.getKills(), "Kills are not the same");
    }
    @Test
    public void test_animal_setColour(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setColour("Grey");
        assertEquals("Grey", testBat.getColour(), "Colours are not the same");
    }
    @Test
    public void test_animal_setAge(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setAge(10);
        assertEquals(10, testBat.getAge(), "Ages are not the same");
    }
    @Test
    public void test_animal_setAlive(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        testBat.setAlive(false);
        assertFalse(testBat.isAlive(), "Ages are not the same");
    }
    @Test
    public void test_animal_move(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        assertEquals("Moving", testBat.move(), "Doesn't move");
        testBat.die();
        assertEquals("Not Moving", testBat.move(), "Bat moves while dead");
    }
    /*@Test
    public void test_animal_breed(){
        Bat testBat = new Bat(true, 4, "Black", 100);
        Bat testBat2 = new Bat(true, 4, "Black", 100);
        assertEquals(, testBat.breed(testBat2), "Cannot breed");

    }*/
}
