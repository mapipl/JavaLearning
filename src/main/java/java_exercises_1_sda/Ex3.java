package java_exercises_1_sda;

//Napisz funkcję, która dla zadanych dwóch parametrów X i Y obliczy sumę liczb od X do Y

public class Ex3 {

    public static void main(String[] args) {
        System.out.println(sumOfCalculation(1, 5));
    }

    public static int sumOfCalculation(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }

}
