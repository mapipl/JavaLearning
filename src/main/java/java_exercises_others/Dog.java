package java_exercises_others;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dog implements Animal {
    private String dogSound;

    @Override
    public String makeSound() {
        return dogSound;
    }
}
