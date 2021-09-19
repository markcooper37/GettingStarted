package com.amigoscode.email;

public class Main {

    public static void main(String[] args) {

        EmailValidator ev = new EmailValidator();

        ev.checkEmail("something@gmail.com");
        ev.checkEmail("somethinggmail.com");
    }
}
