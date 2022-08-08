package com.TSI.Allen.Brandon;

public abstract class Mammal extends Animal{

    public Mammal(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }

    public String breathe(){
        return "Breathing...";
    }

    public String breed(){
        return "Live Birth";
    }
}
