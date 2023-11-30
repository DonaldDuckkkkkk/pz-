import static java.lang.System.*;

public class Main {

    public static MyArrayList<Car> myArrayList = new MyArrayList<>();

    public static void main(String[] args) {

        Truck truck = new Truck(120, 500, 4, 8000, 140, 1000);
        PassengerCar sportCar = new PassengerCar(100, 300, 2.2, 10000, 220, "Motor");
        PassengerMinibus passengerMinibus = new PassengerMinibus(110, 400, 1.8, 5000, 180, 15);
        Truck truck2 = new Truck(120, 500, 4, 8000, 140, 1000);
        PassengerCar sportCar2 = new PassengerCar(100, 300, 2.2, 10000, 220, "Duck");
        PassengerMinibus passengerMinibus2 = new PassengerMinibus(110, 400, 1.8, 5000, 180, 15);
        Truck truck1s = new Truck(120, 500, 4, 8000, 140, 1000);
        Truck truck2s = new Truck(100, 550, 3.7, 18000, 140, 1300);


        TaxiPark.add(truck);
        TaxiPark.add(sportCar);
        TaxiPark.add(passengerMinibus);
        TaxiPark.add(truck2);
        TaxiPark.add(sportCar2);
        TaxiPark.add(passengerMinibus2);
        TaxiPark.add(truck1s);
        TaxiPark.add(truck2s);

        TaxiPark.get();
        out.println();

        TaxiPark.sumPrice();
        out.println();

        TaxiPark.sortByFuelConsumption();
        TaxiPark.get();
        out.println();

        out.println(TaxiPark.searchCarOfMaxSpeed(10));
        out.println(TaxiPark.searchCarOfMaxSpeed(220));
        out.println();

        TaxiPark.nameProfession(truck);
        TaxiPark.nameProfession(sportCar);
        TaxiPark.nameProfession(passengerMinibus);
        TaxiPark.clasCar(truck);
        TaxiPark.clasCar(sportCar);
        TaxiPark.clasCar(passengerMinibus);
        out.println();

        out.println(TaxiPark.searchCar(truck2s));
        out.println(TaxiPark.searchCar(truck1s));




        myArrayList.addAll(TaxiPark.getArr());

        out.println("list");

        for (int i = 0; i < myArrayList.size(); i++) {
            out.println(myArrayList.get(i));
        }
        Car[] cars = {truck1s, truck2s};
        myArrayList.addAll(2,cars);
        out.println();
        for (int i = 0; i < myArrayList.size(); i++) {
            out.println(myArrayList.get(i));
        }
        out.println(myArrayList.size());
        out.println();
        myArrayList.addAll(1, cars);
        for (int i = 0; i < myArrayList.size(); i++) {
            out.println(myArrayList.get(i));
        }
        out.println(myArrayList.size());
        out.println("end list");
    }
}