package com.company.devices;

import com.company.Human;

import java.util.ArrayList;

public abstract class Car extends Device {
    public double value;
    String color;
    Integer seats;
    public ArrayList<Human> carOwners;


    public Car(String model, String producer, String yearOfProduction, double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
        this.carOwners = new ArrayList<Human>();
    }

    abstract void refuel();

    public void CheckOwner(Human human)
    {
        if(carOwners.contains(human))
        {
            System.out.println(human.getFirstName() + "was an owner of this car");
        }
        else {
            System.out.println(human.getFirstName() + "was not an owner of this car");
        }
    }

    public void TransactionHistory(Human owner, Human lastOwner)
    {
        int checkvalue = this.carOwners.indexOf(owner);
        if (this.carOwners.get(checkvalue-1) == lastOwner)
        {
            System.out.println(owner.getFirstName() + " bought this car from " + lastOwner.getFirstName());
        }
        else
        {
            System.out.println(owner.getFirstName() + " bought this car from somebody else");

        }
    }

    public void CountTransactions()
    {
        System.out.println("Transaction made:" + this.carOwners.size());
    }

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
            if (seller.garage[i].equals(this) &&
                    seller.garage[i].carOwners.get(carOwners.size() -1) == seller) {
                Car tempcar = seller.garage[i];
                for (int j = buyer.garage.length - 1; j >= 0; j--) {
                    if (buyer.garage[j] == null) {
                        if (buyer.cash >= price) {
                            seller.garage[i] = null;
                            buyer.garage[j] = tempcar;
                            buyer.cash -= price;
                            seller.cash += price;
                            System.out.println("Transaction Success.");
                            tempcar.carOwners.add(buyer);
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

