package com.TSI.Allen.Brandon;

import java.lang.reflect.InvocationTargetException;

public abstract class Animal {

    private boolean alive;
    private int age;
    private String colour;
    private int HP;
    private int Kills;

    public Animal(boolean alive, int age, String colour, int HP){
        this.alive = alive;
        this.age = age;
        this.colour = colour;
        this.HP = HP;
    }

    public Animal(boolean alive, int age, String colour){
        this.alive = alive;
        this.age = age;
        this.colour = colour;
    }

    public Animal(boolean alive, String colour){
        this.alive = alive;
        this.colour = colour;
    }

    public abstract String eat();

    public String move(){
        if(this.alive){
            return "Moving";
        }
        else{
            return "Not Moving";
        }
    }

    public abstract String breathe();

    public String sleep(){
        return "Sleeping";
    }

    public String poop(){
        return "Pooping";
    }

    public Animal breed(Animal partner) {
        Animal babyAnimal = null;
        try {
            babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
        }
        catch(Exception e){

        } finally {
            return babyAnimal;
        }

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

    public int getKills() {
        return Kills;
    }

    public void setKills(int kills) {
        Kills = kills;
    }

    public Animal kill(Animal animal) {
        animal.die();
        Kills++;
        return animal;
    }
}
