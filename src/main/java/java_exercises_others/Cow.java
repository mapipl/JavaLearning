package java_exercises_others;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cow implements Animal {
    private String cowSound;

//    public Cow(String mlaskMlask) {
//        this.cowSound = mlaskMlask;
//    }

    @Override
    public String makeSound() {
        return cowSound;
    }

//    public Cow(String cowSound) {
//        this.cowSound = cowSound;
//    }
}
