package com.company.devices;

import com.company.Salleable;

public abstract class Device implements Salleable {
    public final String producer;
    public final String model;
    String yearOfProduction;
    Double value;

    public Device(String producer, String model, String yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getYearOfProduction() { return yearOfProduction; }

    public abstract void turnOn();


    @Override
    public String toString() {
        return "Device: " + getClass().getName() +" Model: " + model + " Producer: " + producer +" Year of production: " + yearOfProduction;
    }
}
