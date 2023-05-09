package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // instance variables (fields)
    private double salary;





    // constructors
    public SalariedEmployee() {

    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // enrollIn401k()
    }


    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);  // delegate to neighboring ctor above me for name , hireDate
        setSalary(salary);  // delegate to setter for validation or conversion
    }

    // business methods or "action" methods

    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());       // inherited getName() method from base class Employee
    }

    // accessors methods

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // toString method
    @Override
    public String toString() {
        return "SalariedEmployee: name= " + super.toString() + ", salary= " + getSalary();      // using super.toString to retrieve fields already returned in the Employee base class
    }
}