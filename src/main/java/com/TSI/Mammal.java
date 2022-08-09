package com.TSI;

public abstract class Mammal extends Animal{

    public Mammal(boolean alive, int age, String colour, int HP) {
        super(alive, age, colour, HP);
    }
    public Mammal(boolean alive, int age, String colour) {
        super(alive, age, colour);
    }
    public Mammal(boolean alive, String colour) {
        super(alive, colour);
    }

    public String breathe(){
        return "Breathing...";
    }

}
