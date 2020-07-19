package java_exercises_others;

import java.util.HashMap;
import java.util.Map;

public class Other3 {


    public static Map<Integer, String> mapExercise() {

        Map<Integer, String> mapOfNames = new HashMap<>();
        mapOfNames.put(1, "Monika");
        mapOfNames.put(2, "Beata");
        mapOfNames.put(3, "Krzyś");
        System.out.println("Mapa: " + mapOfNames.size());
        System.out.println(mapOfNames.get(1));
        mapOfNames.put(1, "Maciek");
        System.out.println("Mapa: " + mapOfNames.size());
        System.out.println(mapOfNames.get(1));
        return mapOfNames;
    }

    public static void main(String[] args) {
        Map<Integer, String> familyMap = mapExercise();
        System.out.println("START");
        System.out.println(familyMap.get(1));
        System.out.println(familyMap.get(2));
        System.out.println(familyMap.get(3));
    }

}
