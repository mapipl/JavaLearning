package java_exercises_1_sda;

//Napisz funkcję tworzącą ciąg arytmetyczny o podanych: długości, pierwszym elemencie,
//        różnicy ciągu

public class Ex7 {

    public static void main(String[] args) {
        int[] result = arraySeries(4, 1, 2);
        Ex6.tablePrint(result);
    }

    public static int[] arraySeries(int lenght, int firstNumber, int gap) {
        int[] array = new int[lenght];
        array[0] = firstNumber;
        for (int i = 1; i < lenght; i++) {
            array[i] = array[i - 1] + gap;
        }
        return array;
    }

}

//    public static void tablePrint(int[] array) {
//        for (int index : array) {
//            System.out.println("[" + index + "] ");
//        }
//        System.out.println("");
