/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        Employee emp = new SalariedEmployee();


        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 10000.00));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 45.0, 50));
        dept.addEmployee(new SalariedEmployee("Exxon ", LocalDate.of(2000, 5, 20), 200000.00));
        dept.addEmployee(new HourlyEmployee("Paty", LocalDate.of(2012,8,12), 25.0, 40.0));
        dept.addEmployee(new Executive( "Mike", LocalDate.of(2008, 5, 01), 500_000.00));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println( "Pay employees:");
        dept.payEmployees();

        // forced holiday break
        System.out.println("Forced holiday break");
        dept.holidayBreak();
    }
}