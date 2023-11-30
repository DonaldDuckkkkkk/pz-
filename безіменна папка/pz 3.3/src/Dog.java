import java.time.LocalDate;
import java.util.Random;

public class Dog extends PatAnimal implements Comparable<Dog> {
    public int scaredOfThievesCount = new Random().nextInt(getAge() * getAge() + 1);

    public Dog(String name, LocalDate yearOfBirth) {
        super(name, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Dog " + name + " scared of " + scaredOfThievesCount + " mice";
    }

    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.scaredOfThievesCount, o.scaredOfThievesCount);
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep");
    }

    @Override
    public void makeSound() {
        System.out.println("dog sound");
    }
}