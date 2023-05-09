package com.panion;

import java.time.LocalDate;
import java.time.Period;

class Person {
    // if we dont use setters these fields are effectively "final" becaause the user cannot change them
    // A convention is that if a variable is effectively "final" then we add the keyword
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;           // this is here because we dont want to write any public or private setters
        this.birthDate = birthDate;     // we do this " direct assignment so that we dont have to write setter constructors"
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();

    }

    // We don't need Setters if we don't have to do data validation or minipulation at all.
    // setName() {}

    public String toString() {
//        return "Person: name= " + getName() + "birthDate= " + getBirthDate();
        return String.format(" Person: name=%s, birthdate=%s", getName(), getBirthDate());
    }
}