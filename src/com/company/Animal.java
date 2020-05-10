
package com.company;

import java.io.File;

public class Animal implements salleable {
    final String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species == "Dog") {
            weight = 10.0;
        } else if (species == "Lion") {
            weight = 180.0;
        } else {
            weight = 1.0;
        }

    }


    void feed() {
        if (weight <= 0)
        {
            System.out.println("Sorry, your animal is dead, you cant feed it anymore");
        } else {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        }
    }

    void takeout() {
        if (weight <= 0) {
            System.out.println("Sorry, your animal is dead, you cant take it for a walk.");
        } else {
            weight -= 1;
            System.out.println("Thx for a walk, my weight is now " + weight);
        }
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
            if(seller.cash >= price){
                buyer.cash -= price;
                buyer.pet = seller.pet;
                seller.pet = null;
                seller.cash += price;
                System.out.println("Transaction success.");
            } else { System.out.println("Not enough money."); }
    }
}