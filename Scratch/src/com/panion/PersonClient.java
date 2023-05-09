package com.panion;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Exxon", LocalDate.of(1990, 01,30));
        System.out.println(p1);
        System.out.println(p1.getAge());

        System.out.println(p1.getName() + " is " + p1.getAge() + " years old");
    }
}