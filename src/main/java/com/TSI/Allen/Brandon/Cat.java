package com.TSI.Allen.Brandon;

public final class Cat extends Mammal{

    private int Kills;
    private String name;

    public Cat(boolean alive, int age, String name, String colour, int HP) {
        super(alive, age, colour, HP);
        this.name = name;
    }

    public String eat() {
        return "Shears off chunks of meat";
    }

    public Animal attack(Animal animal){
        animal.setHP(animal.getHP()-10);
        return animal;
    }

    public Animal kill(Animal animal) {
        animal.die();
        Kills++;
        return animal;
    }

    public int getKills() {
        return Kills;
    }

    public void setKills(int kills) {
        Kills = kills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
