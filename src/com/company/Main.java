
package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Szarik";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Human me = new Human();
        me.firstName = "Adrian";
        me.lastName = "Nowacki";
        me.pet = dog;

        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Lion");
        me.pet.name = "Myszojeleń";

        me.pet.feed();

        System.out.println(me.pet.species);

        Animal cat = new Animal("cat");
        cat.feed();
        for (int i=1; i<14;i++)
        {
            cat.takeout();
        }
        cat.feed();

        Car car = new Car();
        car.seats = 2;
        car.color = "czerwony";
        car.model = "e36";
        car.producent = "bmw";

        me.car = car;

    }
}