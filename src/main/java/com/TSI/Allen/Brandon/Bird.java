package com.TSI.Allen.Brandon;

public abstract class Bird extends Animal {

    public Bird(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }

    public String breathe(){
        return "Breathing...";
    }

    public String breed(){
        return "Lay Eggs";
    }
}