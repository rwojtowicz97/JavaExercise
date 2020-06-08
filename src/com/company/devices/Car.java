package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    public double value;
    String color;
    Integer seats;


    public Car(String model, String producer, String yearOfProduction, double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    abstract void refuel();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car simpson = (Car) o;
        return model == simpson.model &&
                producer.equals(simpson.producer);
    }

    @Override
    public void turnOn() {
        System.out.println("turn on Car");
    }

    @Override
    public void sell(Human seller, Human buyer, double price) throws Exception {
//        if(seller.getCar() == this){
//            if(seller.cash >= price){
//                buyer.cash -= price;
//                buyer.setCar(this);
//                seller.setCar(null);
//                seller.cash += price;
//                System.out.println("Transaction success.");
//            } else { System.out.println("Not enough money."); }
//        } else {
//            System.out.println("Seller doesnt have this car");
//        }
//        System.out.println("test1");
//        for (int i = seller.garage.size() - 1; i >= 0; i--) {
//            System.out.println("test2");
//            if (seller.getCar(i).equals(this)) {
//                for (int j = buyer.garage.size() - 1; j <= 0; j--) {
//                    if (buyer.garage.get(j) == null) {
//                        if (buyer.cash >= price) {
//                            Car tempcar = seller.getCar(i);
//                            seller.garage.remove(tempcar);
//                            buyer.garage.add(tempcar);
//                            buyer.cash -= price;
//                            seller.cash += price;
//                            System.out.println("Transaction Success.");
//                        }
//                    } else {
//                        throw new Exception("Buyers garage is full");
//                    }
//                }
//            } else {
//                throw new Exception("Seller doesn't have this car");
//            }
//        }
        System.out.println("test1");
        for (Car car : seller.garage ) {
            System.out.println("test2");
            System.out.println(car);
            System.out.println(this);
            System.out.println(car.equals(this));
            if (car.equals(this)) {
                for (int j = buyer.garage.size() - 1; j <= 0; j--) {
                    if (buyer.garage.get(j) == null) {
                        if (buyer.cash >= price) {
                            Car tempcar = car;
                            seller.garage.remove(car);
                            buyer.garage.add(tempcar);
                            buyer.cash -= price;
                            seller.cash += price;
                            System.out.println("Transaction Success.");
                        }
                    } else {
                        throw new Exception("Buyers garage is full");
                    }
                }
            } else {
                throw new Exception("Seller doesn't have this car");
            }
        }
    }
}
