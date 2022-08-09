package com.TSI.tests;

import com.TSI.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {
    @Test
    public void test_penguin_eats(){
        Penguin testPenguin = new Penguin(true, "Black");
        Penguin testPenguin2 = new Penguin(true, 4,"Black");
        Penguin testPenguin3 = new Penguin(true, 4,"Black", 50);
        assertEquals("Swallows food whole", testPenguin.eat(), "Doesn't eat");
    }
}
