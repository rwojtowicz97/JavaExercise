
package com.company;

import com.company.devices.Application;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Adaś", "Miauczyński", 2000d);
        me.cash = 500d;

        Human me2 = new Human("Czesław", "Kret", 2000d);
        me2.cash = 400d;

        Phone iphone = new Phone("X", "Apple", "1410", 23.4);
        me2.phone = iphone;
        Application flappyBird = new Application("gFlappy Bird","1.0", 20d);
        Application flappyBird1 = new Application("aFlappy Bird Free","1.1", 0d);
        Application flappyBird2 = new Application("cFlappy Bird Free legit no scam","1.2", 99d);

        me.PrintAllCars();

        me.SortCarsByYearOfProduction();

        me.PrintAllCars();

        me.getCar(0).sell(me,me2, 200d);

        me2.PrintAllCars();
        System.out.println(me2.getCar(1));
        me2.getCar(3).CountTransactions();
        System.out.println("me cars:");
        me.PrintAllCars();
        System.out.println("me2 cars:");
        me2.PrintAllCars();
        System.out.println("me2 cars:");

        me2.PrintAllCars();
        me2.getCar(3).TransactionHistory(me2, me);

        me2.phone.installAnnApp(flappyBird, me2);
        me2.phone.installAnnApp(flappyBird1, me2);
        me2.phone.installAnnApp(flappyBird2, me2);

        me2.phone.checkIsAppInstalled(flappyBird);
        me2.phone.checkIsAppInstalled("aFlappy Bird");
        me2.phone.checkIsAppInstalled("Instagram");
        me2.phone.printAllFreeApps();
        me2.phone.appsValue();

        me2.phone.printAllAppsByName();
        me2.phone.printAllAppsByPrice();




    }
}