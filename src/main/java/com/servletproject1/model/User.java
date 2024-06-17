package com.servletproject1.model;

import java.io.Serializable;


public class User implements Serializable {

    private double principalAmount;
    private double interestRate;
    private int time;
    private int compoundNumber;

    public User(int time){
        this.time = time;
    }

    public User(double principalAmount, double interestRate, int time, int compoundNumber) {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.time = time;
        this.compoundNumber = compoundNumber;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCompoundNumber() {
        return compoundNumber;
    }

    public void setCompoundNumber(int compoundNumber) {
        this.compoundNumber = compoundNumber;
    }
}
