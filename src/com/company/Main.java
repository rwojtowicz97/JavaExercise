
package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("Dog");
        dog.name = "Szarik";

        Human me = new Human("Adaś", "Miauczyński", 2000d);
        me.pet = dog;


        me.pet = new Animal("Lion");
        me.pet.name = "Myszojeleń";


        Car car = new Car("e36", "bmw", "2001",200d);
        Car car1 = new Car("e36", "bmw", "2001",200d);



        FinanceManager financeManager = new FinanceManager();
        financeManager.paySalary(me, 200d, true);


        Phone phone = new Phone("X213213", "XIAOMI", "2007",4.5);

        System.out.println(car.equals(car1));

        System.out.println(me);
        System.out.println(dog);
        System.out.println(car);
        System.out.println(phone);


        car.turnOn();
        phone.turnOn();
    }
}