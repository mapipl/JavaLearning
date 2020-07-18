package java_exercises_1_sda;

//Sprawdź, czy podany ciąg liczb jest ciągiem arytmetycznym

public class Ex8 {

    public static void main(String[] args) {
        int[]arrayIsNotCorrect = {4, 52, 4, 7};
        int[]arrayIsCorrect = {1, 5, 9, 13};
        Ex6.tablePrint(arrayIsCorrect);
        boolean result = isArithmetic(arrayIsCorrect);
        System.out.println(result);
    }

    public static boolean isArithmetic(int[] arrayArithmetic) {
        if (arrayArithmetic.length < 2) {
            return false;
        }
        boolean isCorrect = true;
        int gap = arrayArithmetic[1] - arrayArithmetic[0];
        for (int i = 2; i < arrayArithmetic.length; i++){
            int actualGap = arrayArithmetic[i] - arrayArithmetic[i-1];
            if (actualGap != gap){
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }

}
