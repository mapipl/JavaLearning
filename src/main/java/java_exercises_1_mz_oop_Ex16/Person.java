package java_exercises_1_mz_oop_Ex16;

//@AllArgsConstructor - odpowiada konstruktorowi ze wszystkimi parametrami

public class Person {

    public static final Integer MAX_AGE = 130;

    //pola lub atrybuty
    private String name;
    private String surname;
    private int age = 18;

    //konstruktor z parametrem
    public Person() {
        this.name = "młody";
        this.surname = "buk";
//        this.age = 18;
    }


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 20;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public void introduce() {
        System.out.println("Hello I'm " + this.name + this.surname);
    }

    public void introduce(String hello) {
        System.out.println(hello + " " + this.name + " " + this.surname);
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
