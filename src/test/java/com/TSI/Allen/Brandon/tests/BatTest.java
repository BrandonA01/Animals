package com.TSI.Allen.Brandon.tests;

import com.TSI.Allen.Brandon.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BatTest {
    @Test
    public void test_bat_eats(){
        Bat testBat = new Bat(true, 4, "Black");
        testBat.eat();
        assertEquals(1, testBat.getInsects_eaten(), "Bat doesn't eat.");
    }
}