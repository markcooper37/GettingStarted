package com.amigoscode.survey;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Survey survey = new Survey();

        String[] testQuestions = new String[]{"What is your name?", "How old are you?", "What is your favourite colour?"};
        survey.makeSurvey(testQuestions);

    }

}
