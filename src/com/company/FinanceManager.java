package com.company;

public class FinanceManager {
    public void paySalary(Human worker, Double salary, Boolean isAneksRequired) throws Exception {
        if(salary > 0) {
            worker.setSalary(worker.getSalary() + salary);
            sendToAccountSystem(worker, salary);
        } else throw new Exception("Troszke za mało");
        checkAneksRequired(isAneksRequired);
        System.out.println(getZusAndUssStatus());
    }

    private void checkAneksRequired(Boolean isAneksRequired) {
        if (isAneksRequired) {
            System.out.println(getAneks());
        }
    }

    private void sendToAccountSystem(Human worker, Double salary) {
        System.out.println("Worker: " + worker.getFirstName() + " " + worker.getLastName() + " get: " + salary);
        System.out.println("Total balance: " + worker.getSalary());
    }

    private String getAneks() {
        return "proszę to twój aneks";
    }

    private String getZusAndUssStatus(){
        return "Zus i tak już wie";
    }
}
