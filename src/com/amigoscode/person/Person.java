package com.amigoscode.person;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private Gender gender;
    private java.time.LocalDate dateOfBirth;
    private int age;

    public Person() {}

    public Person(String firstName, String lastName, Gender gender, java.time.LocalDate dateOfBirth, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    public Person(String firstName, Gender gender, int age) {
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
