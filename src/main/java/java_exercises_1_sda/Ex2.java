package java_exercises_1_sda;

//Dla danej liczby sprawdź, czy jest ona liczbą pierwszą.

public class Ex2 {

    public static void main(String[] args) {

        System.out.println(isPrime(10));
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return result;
    }

}
