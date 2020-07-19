package java_exercises_1_mz_oop_Ex16;

import java.util.LinkedList;
import java.util.List;

public class Validator {

    public static List<Person> filterPerson(List<Person> listOfPerson) {
        List<Person> filtered = new LinkedList<>();
        for (Person person : listOfPerson) {
            if (person.getAge() <= Person.MAX_AGE) {
                filtered.add(person);
            }
        }
        return filtered;
    }
}
