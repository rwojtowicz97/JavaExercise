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
    public Car[] garage;

    public Human(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.garage = new Car[4];
        this.garage[0] = new LPG("JD","test","2019", 500d);
        this.garage[1] = new LPG("PP","test","2018", 400d);
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
        return garage[parkingSpace];
    }

    public void setCar(Car car, int parkingSpace) {
        this.garage[parkingSpace] = car;
    }

    public void PrintAllCars()
    {
        for (Car car: garage
             ) {
            if(car == null)
            {
                continue;
            }
            System.out.println(car.toString());

        }
    }

    public void CarsValue() {
        double sum = 0;
        for (Car car : this.garage) {
            sum += car.value;
        }
        System.out.println("Cars value = " + sum);
    }

    public void SortCarsByYearOfProduction() {
        Arrays.sort(this.garage, compareByYear);
    }

    Comparator<Car> compareByYear = new Comparator<Car>() {
        @Override
        public int compare(Car car, Car t1) {
            if (t1 == null || car == null){
                return 0;
            }
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