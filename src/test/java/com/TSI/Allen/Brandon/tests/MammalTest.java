package com.TSI.Allen.Brandon.tests;

import com.TSI.Allen.Brandon.Cat;
import com.TSI.Allen.Brandon.Mammal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MammalTest {
    @Test
    public void get_mammal_breeding(){
        Mammal testCat = new Cat(true, "Black");
        //assertEquals("Live Birth", testCat.breed(), "Mammal is infertile.");
    }
    @Test
    public void get_mammal_breathing(){
        Mammal testCat = new Cat(true, "Black");
        assertEquals("Breathing...", testCat.breathe(), "Mammal is being asphyxiated");
    }
}
