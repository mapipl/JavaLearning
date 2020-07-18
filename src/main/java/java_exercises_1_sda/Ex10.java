package java_exercises_1_sda;

//Właśnie się dowiedziałeś, że istnieje operator %. Napisz funkcję, która będzie sprawdzała,
//        czy napisana w poprzednim zadaniu funkcja zwraca dokładnie takie same wyniki jak ten
//        operator. Przetestuj dla różnych przypadków.

public class Ex10 {

    public static void main(String[] args) {

        System.out.println("Ex9: ");
        int[] testTab = {1, 5, 7, 122, 45};
        System.out.println("Assert true: " + Ex10.testMyModulo(testTab, 3));
    }

    public static boolean testMyModulo(int[] testNumb, int mod) {
        for (int number : testNumb) {
            int originRest = number % mod;
            int myRest = Ex9.myModulo(number, mod);
            if (originRest != myRest) return false;
        }
        return true;
    }

}
