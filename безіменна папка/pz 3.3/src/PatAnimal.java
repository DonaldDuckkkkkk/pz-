import java.time.LocalDate;
import java.util.IllformedLocaleException;

public abstract class PatAnimal {
    public String name;
    public LocalDate yearOfBirth;

    public PatAnimal(String name, LocalDate yearOfBirth) {
        this.name = name;

        if (LocalDate.now().isAfter(yearOfBirth)){
            this.yearOfBirth = yearOfBirth;
        } else {
            throw new IllformedLocaleException("Incorrect age");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearOfBirth.getYear();
    }

    public abstract void sleep();

    public abstract void makeSound();
}