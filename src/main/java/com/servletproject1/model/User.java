package com.servletproject1.model;

import java.io.Serializable;


public class User implements Serializable {

    private String principalAmount;
    private String interestRate;
    private String time;
    private String compoundNumber;

    public User() {

    }

    public User(String principalAmount, String interestRate, String time, String compoundNumber) {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.time = time;
        this.compoundNumber = compoundNumber;
    }

    public String getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCompoundNumber() {
        return compoundNumber;
    }

    public void setCompoundNumber(String compoundNumber) {
        this.compoundNumber = compoundNumber;
    }
}