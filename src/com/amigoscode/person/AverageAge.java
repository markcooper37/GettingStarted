package com.amigoscode.person;
import com.amigoscode.person.Gender;
import com.amigoscode.person.Person;

import java.util.List;

public class AverageAge {

    public double averageAge(List<Person> peopleList, Gender gender) {
        int peopleCounter = 0;
        double totalAge = 0;
        for (Person person : peopleList) {
            if (person.getGender() == gender) {
                totalAge = totalAge + person.getAge();
                peopleCounter++;
            }
        }
        return totalAge / peopleCounter;
    }

}
