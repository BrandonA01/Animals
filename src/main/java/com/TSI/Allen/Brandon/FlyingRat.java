package com.TSI.Allen.Brandon;

import java.util.ArrayList;

public final class FlyingRat extends Bird implements Flying{

    private int pasties_eaten;

    public FlyingRat(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }
    public FlyingRat(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public FlyingRat(boolean alive, String colour) {
        super(alive, colour);
    }

    public String eat() {
        pasties_eaten++;
        return "Pecks at Greggs Pasty";
    }

    public String takeOff() {
        return "Flapping";
    }

    public String flying() {
        return "Gliding";
    }

    public String land() {
        return "Landed";
    }
}
