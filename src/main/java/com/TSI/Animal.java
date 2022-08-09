package com.TSI;

import java.util.logging.Logger;
import static java.util.logging.Level.INFO;

public abstract class Animal {

    private boolean alive;
    private int age;
    private String colour;
    private int hp;
    private int kills;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Animal.class));
    private static final String SLEEP = "Sleeping";
    private static final String POOP = "Pooping";

    protected Animal(boolean alive, int age, String colour, int hp){
        this.alive = alive;
        this.age = age;
        this.colour = colour;
        this.hp = hp;
    }

    protected Animal(boolean alive, int age, String colour){
        this.alive = alive;
        this.age = age;
        this.colour = colour;
    }

    protected Animal(boolean alive, String colour){
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
        return SLEEP;
    }

    public String poop(){
        return POOP;
    }

    public Animal breed(Animal partner){

        Animal babyAnimal;
        if (this.getClass().equals(partner.getClass())){
            try {
                babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
                return babyAnimal;
            }
            catch(Exception e){
                LOGGER.log(INFO,"Incompatible types of animals");
                return null;
            }
        }
        return null;
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
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        kills = kills;
    }

    public Animal kill(Animal animal) {
        animal.die();
        kills++;
        return animal;
    }
}
