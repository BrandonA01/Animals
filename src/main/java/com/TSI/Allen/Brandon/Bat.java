package com.TSI.Allen.Brandon;

public final class Bat extends Mammal{

    public Bat(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }

    public String noise(){
        return "Squeeeeeeeek";
    }

    public String eat() {
        return "Eats insect";
    }

    public String takeOff() {
        return "Taking Off";
    }

    public String flying() {
        return "Flapping Continuously";
    }

    public String land() {
        return "Landed";
    }
}