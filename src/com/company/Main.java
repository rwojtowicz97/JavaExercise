
package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Adaś", "Miauczyński", 2000d);
        me.cash = 500d;

        Human me2 = new Human("Czesław", "Kret", 2000d);
        me2.cash = 200d;

        me.CarsValue();

        me.getCar(0).sell(me,me2, 200d);

        System.out.println(me.garage.size());
        me.CarsValue();
        System.out.println(me.garage.get(0));
        System.out.println(me.garage.get(1));
        System.out.println(me.garage.get(1).equals(me.garage.get(1)));


    }
}