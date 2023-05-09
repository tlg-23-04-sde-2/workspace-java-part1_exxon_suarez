package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name,hireDate);   // pass to neighbor ctor for name, hireDate
        setRate(rate);      // delegate to setters for validation or conversions
        setHours(hours);    // delegate to setters for validation or conversions
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    // business methods or "action" methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }


    // accessor methods

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // toString
    @Override

    public String toString() {
    return "HourlyEmployee: name= " + super.toString() +", rate= " + getRate() + ", hours=" + getHours();       // using super.toString to retrieve name and hire date already retrieved by the Employee class toString
    }

    @Override
    public void payTaxes() {
        System.out.println( getName() + "payed taxes of: " + getHours() * getRate() * TaxPayer.HOURLY_TAX_RATE);
    }

    @Override
    public double getStandardDeduction() {
        return 2500;
    }
}