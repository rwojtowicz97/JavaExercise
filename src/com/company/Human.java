package com.company;

import devices.Car;
import devices.Phone;

import java.time.LocalTime;

public class Human {
    private String firstName;
    private String lastName;
    private double salary;
    private LocalTime lastCheck;
    private double salaryBeforeGet;
    Phone phone;
    Animal pet;
    private Car car;


    public Human(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return  lastName;
    }
    public void setLastName() {
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

    public Car getCar() {
        return car;
    }

    public void setCar() {
        if(salary > car.value) {
            System.out.println("Udało się kupić auto za gotówkę");
            this.car = car;
        } else if (salary > (car.value/12)) {
            System.out.println("Udało się kupić auto na kredyt");
            this.car = car;
        } else {
            System.out.println("Unlucky... get a bike");
        }

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