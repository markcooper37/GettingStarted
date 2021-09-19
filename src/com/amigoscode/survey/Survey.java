package com.amigoscode.survey;

import java.io.*;
import java.util.Scanner;

public class Survey {

    public void makeSurvey(String[] questions) throws IOException {

        File file = new File("survey/survey.txt");

        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (String question : questions) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(question);
            String answer = scanner.nextLine();
            printWriter.println(question + " " + answer);
        }

        printWriter.flush();
        printWriter.close();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
