package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    Double screenSize;
    static final String serverAddress = "10.10.10.10";
    static final String port = "4242";
    static final String version = "1.0";

    public Phone(String model, String producer, String yearOfProduction, double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    public void installAnnApp(String appName)
    {

    }
    public void installAnnApp(String appName, String version)
    {

    }
    public void installAnnApp(String appName, String version, String ServerAddress)
    {

    }
    public void installAnnApp(String... appNames)
    {
        for (String appName : appNames)
        {

        }
    }
    public void installAnnApp(URL url)
    {
        
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