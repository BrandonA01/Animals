package com.TSI.Allen.Brandon;

public final class Cat extends Mammal{

    private String name;

    public Cat(boolean alive, int age, String name, String colour, int HP) {
        super(alive, age, colour, HP);
        this.name = name;
    }
    public Cat(boolean alive, int age, String name, String colour) {
        super(alive, age, colour);
        this.name = name;
    }
    public Cat(boolean alive, String name, String colour) {
        super(alive, colour);
        this.name = name;
    }
    public Cat(boolean alive, String colour) {
        super(alive, colour);
    }

    public String eat() {
        return "Shears off chunks of meat";
    }

    public Animal attack(Animal animal){
        animal.setHP(animal.getHP()-10);
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
