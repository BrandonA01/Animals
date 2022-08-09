package com.TSI;

public class Main {
    public static void main(String[] args) {
        //Create new objects
        Cat c = new Cat(true, 3, "Nala", "Black", 200);
        FlyingRat fr = new FlyingRat(true, 5, "Grey");
        Bat b = new Bat(true, 2, "Grey", 50);
        Penguin p = new Penguin(true, 5, "Black and White", 250);
        Cat c2 = new Cat(true, 3, "dwfdfwqd", "Black", 100);

        //Scenario 1

        System.out.println("-----Scenario 1-----");
        c.kill(fr);                                                 //Cat kills Pigeon
        System.out.println("Cat kills pigeon");
        System.out.println("Is the pigeon alive? " + fr.isAlive());       //Check to see if it's alive
        System.out.println("Kill Count: " + c.getKills());          //Amount of kills the cat has
        System.out.println(c.eat());                                //Cat proceeds to eat the pigeon

        // Scenario 2

        System.out.println("\n");
        System.out.println("-----Scenario 2-----");
        while (b.isAlive()) {
            System.out.println("Bat health: " + b.getHP() + " HP");
            //Cat attacks Bat
            if (b.getHP() == 0) {
                System.out.println("Cat kills bat");
                c.kill(b);                                                  //Cat kills Bat
            } else {
                System.out.println("Cat attacks bat..");
                c.attack(b);
            }
            System.out.println("Is the bat alive? " + b.isAlive());       //Check to see if it's alive
            System.out.println("Kill Count: " + c.getKills());          //Amount of kills the cat has
            //System.out.println(c.eat());                                //Cat proceeds to eat the Bat

            Animal c3 = c.breed(c2);
            if (c3 != null) {
                c3.kill(c);
                System.out.println(c3.getKills());
            }
        }
    }
}