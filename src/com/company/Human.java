package com.company;

import java.time.LocalTime;

public class Human {
    private String firstName;
    private String lastName;
    private double salary;
    private LocalTime lastCheck;
    private double salaryBeforeGet;
    Phone phone;
    Animal pet;
    Car car;


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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}