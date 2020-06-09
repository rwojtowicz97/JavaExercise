package com.company.devices;

import com.company.Human;

import java.util.*;

public class Phone extends Device {
    Double screenSize;
    static final String serverAddress = "10.10.10.10";
    static final String port = "4242";
    static final String version = "1.0";
    public HashSet<Application> applications;

    public Phone(String model, String producer, String yearOfProduction, double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.applications = new HashSet<Application>();
    }

    public void checkIsAppInstalled(Application app)
    {
        if(this.applications.contains(app))
        {
            System.out.println("You already have this app.");
        }
        else
            {
                System.out.println("You didnt install this app yet.");
            }
    }
    public void checkIsAppInstalled(String name)
    {
        for (Application app: applications
             ) {
            if(app.Name == name)
            {
                System.out.println("You already have this app.");
                return;
            }
        }
        System.out.println("You didnt install this app yet.");
    }
    public void printAllFreeApps()
    {
        for (Application app: applications
             ) {
            if(app.price == 0)
            {
                System.out.println(app.Name);
            }
        }
    }
    public void printAllAppsByName()
    {
        List<Application> list = new ArrayList<Application>(this.applications);
        Collections.sort(list, compareByName);
        System.out.println("List of apps by Name" + list);
    }
    Comparator<Application> compareByName = new Comparator<Application>() {
        @Override
        public int compare(Application app, Application t1) {
            if (t1 == null || app == null){
                return 0;
            }
            return app.Name.compareTo(t1.Name);
        }
    };
    public void printAllAppsByPrice()
    {
        List<Application> list = new ArrayList<Application>(this.applications);
        Collections.sort(list, compareByPrice);
        System.out.println("List of apps by Name" + list);
    }
    Comparator<Application> compareByPrice = new Comparator<Application>() {
        @Override
        public int compare(Application app, Application t1) {
            if (app.price<t1.price)
            {
                return -1;
            }
            else if (app.price > t1.price)
            {
                return 1;
            }
            return 0;
        }
    };
    public void appsValue()
    {
        double sum = 0;
        for (Application app:applications
             ) {
            sum += app.price;
        }
        System.out.println("Applications value = " + sum);
    }
    public void installAnnApp(Application app, Human owner)
    {
        if(owner.phone == this)
        {
            if(owner.cash >= app.price)
            {
                this.applications.add(app);
                owner.cash -= app.price;
                System.out.println("You have installed an app.");
            }
        }
        else
            {
                System.out.println("It's not your phone.");
            }
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