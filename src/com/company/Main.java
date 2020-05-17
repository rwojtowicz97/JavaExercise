
package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Pet dog = new Pet("Dog");
        dog.name = "Szarik";

        Human me = new Human("Adaś", "Miauczyński", 2000d);
        me.pet = dog;
        me.cash = 200d;


        me.pet = new Pet("Dog");
        me.pet.name = "Myszojeleń";

        Human me2 = new Human("Czesław", "Kret", 2000d);
        me2.cash = 200d;

        LPG car = new LPG("e36", "bmw", "2001",200d);
        LPG car1 = new LPG("e36", "bmw", "2001",200d);



        FinanceManager financeManager = new FinanceManager();
        financeManager.paySalary(me, 200d, true);


        Phone phone = new Phone("X213213", "XIAOMI", "2007",4.5);

        System.out.println(car.equals(car1));

        System.out.println(me);
        System.out.println(dog);
        System.out.println(car);
        System.out.println(phone);
        me.phone = phone;

        car.turnOn();
        phone.turnOn();

        System.out.println("Seller pet: " + me.pet.toString());

        dog.sell(me, me2, 150d);

        System.out.println("seller cash: " + me.cash);
        System.out.println("buyer cash: " + me2.cash);

        phone.sell(me, me2, 50);
        car.sell(me2, me, 100);

        dog.feed(20.5);
        dog.feed();

    }
}