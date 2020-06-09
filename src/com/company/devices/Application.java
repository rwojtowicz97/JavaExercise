package com.company.devices;

public class Application {
    protected String Name;
    protected String Version;
    protected double price;

    public  Application(String name, String version, double price)
    {
        this.Name = name;
        this.Version = version;
        this.price = price;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + Name + '\'' +
                ", version='" + Version + '\'' +
                ", price=" + price +
                '}';
    }
}
