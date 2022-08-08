package com.TSI.Allen.Brandon.tests;
import com.TSI.Allen.Brandon.Bat;
import com.TSI.Allen.Brandon.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void test_get_cat_name(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        assertEquals("Nala", testCat.getName(), "Not the same name");
    }
    @Test
    public void test_is_cat_alive(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        assertEquals(true, testCat.isAlive(), "Nala is dead");
        testCat.die();
        assertEquals(false, testCat.isAlive(), "Nala is alive");
    }
    @Test
    public void test_get_cat_age(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        assertEquals(4, testCat.getAge(), "Not the same age");
    }
    @Test
    public void test_get_cat_colour(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        assertEquals("Black", testCat.getColour(), "Not the same colour");
    }
    @Test
    public void test_cat_kills(){
        Cat testCat = new Cat(true, 4, "Nala", "Black");
        Bat testBat = new Bat(true, 4, "Grey", 100);
        assertEquals(true, testBat.isAlive(), "Bat is not alive");
        assertEquals(0, testCat.getKills(), "Cat should have 0 kills");
        testCat.kill(testBat);
        assertEquals(false, testBat.isAlive(), "Bat is alive");
        assertEquals(1, testCat.getKills(), "Cat should have 1 kill ");
    }
}
