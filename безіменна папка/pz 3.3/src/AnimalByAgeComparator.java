import java.util.Comparator;

public class AnimalByAgeComparator implements Comparator<PatAnimal> {

    /** Sorting order of elements in the list */
    private final Order orderCompare;

    public AnimalByAgeComparator(Order order) {
        this.orderCompare = order;
    }

    @Override
    public int compare(PatAnimal o1, PatAnimal o2) {

        if (orderCompare.equals(Order.ASCENDING)){
            return Integer.compare(o1.getAge(), o2.getAge());
        } else if (orderCompare.equals(Order.DESCENDING)){
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        else {
            return 0;
        }
    }

}