import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<PatAnimal> rancho = new ArrayList<>();

    public static void main(String[] args) {

        Dog gav = new Dog("Gav", LocalDate.of(2015, 1, 19));
        Dog rex = new Dog("Rex", LocalDate.of(2018, 8, 18));
        Dog bob = new Dog("Bob", LocalDate.of(2009, 4, 6));
        Dog zver = new Dog("Zver", LocalDate.of(2022, 5, 12));

        Cat murka = new Cat("Murka", LocalDate.of(2005, 7, 2));
        Cat tom = new Cat("Tom", LocalDate.of(2012, 8, 15));
        Cat jeri = new Cat("Jeri", LocalDate.of(2008, 2, 11));
        Cat lord = new Cat("Lord", LocalDate.of(2007, 9, 18));

        List<Dog> dogArrayList = new ArrayList<>(List.of(gav, rex, bob, zver));
        List<Cat> catArrayList = new ArrayList<>(List.of(murka, tom, jeri, lord));

        Collections.sort(catArrayList);
        for (Cat cat1 : catArrayList) {
            System.out.println(cat1);
        }

        Collections.sort(dogArrayList);
        for (Dog dog1 : dogArrayList) {
            System.out.println(dog1);
        }

        rancho.addAll(dogArrayList);
        rancho.addAll(catArrayList);

        rancho.sort(new AnimalByAgeComparator(Order.ASCENDING));
        for (PatAnimal animal : rancho) {
            System.out.println(animal.getName() + " " + animal.getAge() + " years");
        }

    }
}