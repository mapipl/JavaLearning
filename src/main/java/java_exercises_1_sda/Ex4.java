package java_exercises_1_sda;

//Dla zadanej tablicy 3 intów zamień miejscami pierwszy i trzeci element.
//        Przykład:
//        zadana tablica [12, 7, 19]
//        wynik [19, 7, 12]

public class Ex4 {

    public static void main(String[] args) {
        int[] beforeArray = {12, 7, 19};
        printArray(beforeArray);
        printArray(switchTable(beforeArray));
    }

    public static int[] switchTable(int[] arrayA) {
        if (arrayA.length > 1) {
            int tmp = arrayA[0];
            arrayA[0] = arrayA[arrayA.length - 1];
            arrayA[arrayA.length - 1] = tmp;
        }
        return arrayA;
    }

    public static void printArray(int[] arrayB) {
        for (int value : arrayB) {
            System.out.print("[" + value + "]");
        }
        System.out.println("\n");
    }

}
