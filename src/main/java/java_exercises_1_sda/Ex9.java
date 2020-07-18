package java_exercises_1_sda;

//Załóżmy, że nie wiesz, że istnieje operator %, a potrzebujesz wylicz resztę z dzielenia
//        dwóch liczb. Napisz własną wersję funkcji modulo.

public class Ex9 {

    public static void main(String[] args) {
        System.out.println(Ex9.myModulo(11, 2));
        System.out.println(Ex9.myModulo(10, 2));
        System.out.println(Ex9.myModulo(17, 3));
    }

    public static int myModulo(int number, int mod) {
        System.out.println("number: " + number + " mod: " + mod + ":");
        int total = (int) number / mod;
        System.out.println("test total: " + total);
        float realNum = (float) number / mod;
        System.out.println("test real: " + realNum);
        System.out.print("\n");
        return number - (total * mod);
    }

}
