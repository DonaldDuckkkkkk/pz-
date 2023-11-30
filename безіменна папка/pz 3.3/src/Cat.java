import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat> {
    private final int caughtMiceCount = new Random().nextInt(getAge() * getAge() + 1);

    public Cat(String name, LocalDate yearOfBirth) {
        super(name, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Cat " + name + " caught " + caughtMiceCount + " mice";
    }


    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.caughtMiceCount, o.caughtMiceCount);
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }

    @Override
    public void makeSound() {
        System.out.println("cat sound");
    }
}