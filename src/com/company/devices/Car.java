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
        for (int i = 0; i <= seller.garage.length-1; i++) {
            if (seller.garage[i].equals(this)) {
                Car tempcar = seller.garage[i];
                for (int j = buyer.garage.length - 1; j >= 0; j--) {
                    if (buyer.garage[j] == null) {
                        if (buyer.cash >= price) {
                            seller.garage[i] = null;
                            buyer.garage[j] = tempcar;
                            buyer.cash -= price;
                            seller.cash += price;
                            System.out.println("Transaction Success.");
                            return;
                        }
                    }
                }
                throw new Exception("Buyers garage is full");
            }
        }
        throw new Exception("Seller doesn't have this car");
        }
    }

