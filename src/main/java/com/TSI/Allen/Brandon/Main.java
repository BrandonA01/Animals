package com.TSI.Allen.Brandon;

public class Main {
    public static void main(String[] args){
        //Create new objects
        Cat c = new Cat(true, 3, "Nala", "Black", 100);
        FlyingRat fr = new FlyingRat(true, 5, "Grey", 100);
        Bat b = new Bat(true, 2, "Grey", 50);

        //Scenario 1

        System.out.println("-----Scenario 1-----");
        c.kill(fr);                                                 //Cat kills Pigeon
        System.out.println("Is the pigeon alive? "+fr.isAlive());       //Check to see if it's alive
        System.out.println("Kill Count: " + c.getKills());          //Amount of kills the cat has
        System.out.println(c.eat());                                //Cat proceeds to eat the pigeon

        // Scenario 2

        System.out.println("\n");
        System.out.println("-----Scenario 2-----");
        while(b.isAlive()){
            c.attack(b);                                                    //Cat attacks Bat
            System.out.println(b.getHP()+" HP");
            if (b.getHP()%20 == 0){
                System.out.println(b.noise());
            }
            if (b.getHP()==0){
                c.kill(b);                                                  //Cat kills Bat
            }
        }
        System.out.println("Is the bat alive? "+b.isAlive());       //Check to see if it's alive
        System.out.println("Kill Count: " + c.getKills());          //Amount of kills the cat has
        System.out.println(c.eat());                                //Cat proceeds to eat the Bat
    }
}