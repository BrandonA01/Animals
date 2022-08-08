package com.TSI.Allen.Brandon;

public final class Penguin extends Bird{

    public Penguin(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }

    public String eat() {
        return "Swallow fish whole";
    }
}
