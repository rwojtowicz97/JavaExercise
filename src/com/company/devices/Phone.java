package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    Double screenSize;

    public Phone(String model, String producer, String yearOfProduction, double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("turn on Phone");
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        if (seller.phone == this) {
            if (seller.cash >= price) {
                buyer.cash -= price;
                buyer.phone = seller.phone;
                seller.phone = null;
                seller.cash += price;
                System.out.println("Transaction success.");
            } else {
                System.out.println("Not enough money.");
            }
        }else {
            System.out.println("Seller doesnt have this phone");
        }
    }
}