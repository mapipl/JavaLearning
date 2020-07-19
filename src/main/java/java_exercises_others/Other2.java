package java_exercises_others;

//2. Utwórz zbiór Set implementujący HashSet.
//        •Dodaj trzy imiona do zbioru
//        •Dodaj jedno z tych imion ponownie
//        •Sprawdź rozmiar zbioru

import java.util.HashSet;
import java.util.Set;

public class Other2 {

    public static Set<String> ex2() {
        Set<String> setExamples = new HashSet<>();
        setExamples.add("Jan");
        setExamples.add("Jakub");
        setExamples.add("January");
        System.out.println("Size: " + setExamples.size());

        setExamples.add("Jadwiga");
        System.out.println("Size: " + setExamples.size());

        return setExamples;
    }

    public static void main(String[] args) {
       // Set<String> returnSetExamples = setExamples;
        Set<String> returnSetExamples = ex2();

        for (String name : returnSetExamples){
            System.out.println("Hello " + name);
        }
    }


}
