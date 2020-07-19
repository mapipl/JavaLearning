package java_exercises_others;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat implements Animal {

    private String catSound;

    private Integer age;


    public Cat() {
        this.catSound = "Miał";
    }

    public Cat(String ownSound) {
        this.catSound = ownSound;

    }

//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }

    @Override
    public String makeSound() {

        return catSound;
    }

    public static String testMakeSound() {

        return "testCatSound";
    }

}
