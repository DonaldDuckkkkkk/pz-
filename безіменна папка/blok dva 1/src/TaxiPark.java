import java.util.Arrays;
import java.util.Comparator;

public class TaxiPark {

    private static Car[] taksoparkArr = new Car[]{};

    public TaxiPark() {}

    public static void add(Car car) {
        if (taksoparkArr.length == 0){
            taksoparkArr = new Car[]{car};
        } else{
            Car[] newtaksoparkArr = new Car[taksoparkArr.length + 1];
            System.arraycopy(taksoparkArr, 0, newtaksoparkArr, 0, taksoparkArr.length);
            newtaksoparkArr[newtaksoparkArr.length - 1] = car;
            taksoparkArr = newtaksoparkArr;
        }
    }

    public static void get() {
        for (Car car : taksoparkArr) {
            System.out.println(car);
        }
    }
    public static Car get(int index) {
        try {
            return taksoparkArr[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Going beyond the boundaries of the array");
            return null;
        }
    }

    public static Car[] getArr(){
        return taksoparkArr;
    }

    public static int size() {
        return taksoparkArr.length;
    }

    public static void sumPrice() {
        int sum = 0;
        for (Car str : taksoparkArr) {
            sum += str.getPrice();
        }
        System.out.println("sum prise car in the taksopark: " + sum);
    }

    public static void sortByFuelConsumption() {
        Arrays.sort(taksoparkArr, Comparator.comparingDouble(car -> car.getFuelConsumption()));
    }

    public static String searchCarOfMaxSpeed(int searchMaxSpeed) {
        for (Car car : taksoparkArr) {
            if (searchMaxSpeed == car.getMaxSpeed()) {
                return "car is " + searchMaxSpeed + " max speed " + car;
            }
        }
        return "car is " + searchMaxSpeed + " max speed not found";
    }

    public static void nameProfession(Car car) {
        System.out.println("Profession is people " + car.nameProfesion());
    }

    public static String searchCar(Car searchCar) {
        for (Car carInTaksopark : taksoparkArr) {
            if ((carInTaksopark.hashCode() == searchCar.hashCode() && (carInTaksopark.equals(searchCar)))) {
                return "car is found, is a " + carInTaksopark + " за індексом " + carInTaksopark;
            }
        }
        return "car is not found";
    }

    public static void clasCar(Car car){
        System.out.println(car.clasCar());
    }
}