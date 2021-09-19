package com.amigoscode.person;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person susan = new Person("Susan", "Jones", Gender.FEMALE, java.time.LocalDate.of(1972, 7, 23), 49);
        Person bob = new Person("Bob", "Smith", Gender.MALE, java.time.LocalDate.of(1970, 11, 19), 50);

        Person mike = new Person("Mike", Gender.MALE, 37);
        Person sharon = new Person("Sharon", Gender.FEMALE, 49);
        Person dennis = new Person("Dennis", Gender.MALE, 64);
        Person mary = new Person("Mary", Gender.FEMALE, 21);
        Person brian = new Person("Brian", Gender.MALE, 33);

        AverageAge aa = new AverageAge();

        List<Person> peopleToAverage = Arrays.asList(mike, sharon, dennis, mary, brian);
        System.out.println(aa.averageAge(peopleToAverage, Gender.MALE));

    }

}
