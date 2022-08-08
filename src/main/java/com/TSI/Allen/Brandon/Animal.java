package com.TSI.Allen.Brandon;

public abstract class Animal {

    private boolean alive;
    private int age;
    private String colour;
    private int HP;

    public Animal(boolean alive, int age, String colour, int HP){
        this.alive = alive;
        this.age = age;
        this.colour = colour;
        this.HP = HP;
    }

    public abstract String eat();

    public String move(){
        return "Moving";
    }

    public abstract String breathe();

    public String sleep(){
        return "Sleeping";
    }

    public String poop(){
        return "Pooping";
    }

    public abstract String breed();

    public void die(){
        alive = false;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
