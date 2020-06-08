package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.LPG;
import com.company.devices.Phone;
import java.time.LocalTime;
import java.util.*;


public class Human {
    private String firstName;
    private String lastName;
    private double salary;
    private LocalTime lastCheck;
    private double salaryBeforeGet;
    public double cash;
    public Phone phone;
    public Animal pet;
    public ArrayList<Car> garage;

    public Human(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.garage = new ArrayList<Car>(4);
        this.garage.add(new LPG("JD","test","2010", 500d));
        this.garage.add(new LPG("PP","test","2018", 400d));
    }

    public Human(String firstName, String lastName, double salary, int garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        Car[] garage = new Car[garageSize];
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return  lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        this.salaryBeforeGet = salary;
        this.lastCheck = LocalTime.now();
        System.out.println("Wypłata przed sprawdzeniem: "+ salaryBeforeGet + ", Data sprawdzenia: " +  lastCheck);
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Car getCar(int parkingSpace) {
        return garage.get(parkingSpace);
    }

    public void setCar(Car car, int parkingSpace) {
        this.garage.set(parkingSpace, car);
    }

    public void CarsValue() {
        double sum = 0;
        for (Car car : this.garage) {
            sum += car.value;
        }
        System.out.println("Cars value = " + sum);
    }

    public void SortCarsByYearOfProduction() {
        Collections.sort(garage, compareByYear);
    }

    Comparator<Car> compareByYear = new Comparator<Car>() {
        @Override
        public int compare(Car car, Car t1) {
            return car.getYearOfProduction().compareTo(t1.getYearOfProduction());
        }
    };

    public void sell() throws Exception {
        throw new Exception("You cant buy a human");
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}