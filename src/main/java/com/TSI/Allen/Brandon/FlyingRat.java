package com.TSI.Allen.Brandon;

public final class FlyingRat extends Bird implements Flying{

    public FlyingRat(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }

    public String eat() {
        return "Peck at Greggs Pasty";
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
