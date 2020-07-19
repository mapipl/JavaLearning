package java_exercises_others;

//ArrayList

import java.util.ArrayList;
import java.util.List;

public class Other1 {

    public static void main(String[] args) {
        firstList();
    }

    public static void firstList() {
        List<String> names = new ArrayList<>();
        names.add("Ilona");
        names.add("Iwona");
        names.add("Irek");
        System.out.println("List size " + names.size());
        names.add("Iwan");
        System.out.println("List size " + names.size());

        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }

}
