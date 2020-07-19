package java_exercises_1_mz_oop_Ex16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person young = new Person();
        Person johny = new Person("Johny", "Bravo");
        Person ana = new Person("Ana", "Nowak", 25);
        Person old = new Person("old", "Japan", 135);

        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(young);
        listOfPerson.add(johny);
        listOfPerson.add(ana);
        listOfPerson.add(old);

        System.out.println("size " + listOfPerson.size());

        if (!listOfPerson.isEmpty()) {

            Person person = listOfPerson.get(0);

            System.out.println("index 0 " + person.toString());
            System.out.println("index last" + listOfPerson.get(listOfPerson.size() - 1));
        }
        System.out.println("limit wiekowy");

        for (Person person : listOfPerson) {
            System.out.println(person.toString());
        }

        System.out.println("przefiltrowane");

        List<Person> ageFilter = Validator.filterPerson(listOfPerson);

        for (Person person : ageFilter) {
            System.out.println(person.toString());
        }

    }
}
