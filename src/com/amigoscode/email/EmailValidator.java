package com.amigoscode.email;

public class EmailValidator {

    public boolean checkEmail(String email) throws IllegalArgumentException {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid Email");
        } else {
            return true;
        }
    }



}
