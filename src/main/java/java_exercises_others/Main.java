package java_exercises_others;

public class Main {

    public static void main(String[] args) {
        Cat garfield = new Cat();
        Cat filemon = new Cat("Mrau");
        System.out.println(Cat.testMakeSound());

//        String garfieldSound = garfield.makeSound();
//        System.out.println(garfieldSound);
//        System.out.println(filemon.makeSound());

        Cow mucka = new Cow("Mooo");
        System.out.println(mucka.makeSound());

        filemon.setAge(5);
        System.out.println(filemon.getAge());

    }


}
