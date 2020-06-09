
package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Adaś", "Miauczyński", 2000d);
        me.cash = 500d;

        Human me2 = new Human("Czesław", "Kret", 2000d);
        me2.cash = 200d;


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


    }
}