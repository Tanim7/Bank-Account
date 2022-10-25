/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Tahmilur Rahman Tanim
 */
public class Account {

//Instance Variables
    private String name;
    private double balance;
    private int number;

    //Constructor    
    public Account(String name, int number, double initialBalance) {
        this.name = name;
        this.number = number;
        this.balance = initialBalance;

    }

//Methods
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

//Copied Code
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", "
                + String.format("$%.2f", getBalance()) + ")";
    }

}
