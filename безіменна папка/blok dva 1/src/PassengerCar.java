import java.util.Objects;

public class PassengerCar extends Car {
    private String sponsor;

    public PassengerCar() {
    }

    public PassengerCar(int width, int height, double fuelConsumption, int price, int maxSpeed, String sponsor) {
        super(width, height, fuelConsumption, price, maxSpeed);
        this.sponsor = sponsor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar sportCar = (PassengerCar) o;
        return Objects.equals(sponsor, sportCar.sponsor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sponsor);
    }

    public String getSponsor() {
        return sponsor;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", price=" + getPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                ", sponsor='" + sponsor + '\'' +
                '}';
    }

    public String nameProfesion() {
        return "racer";
    }

    @Override
    protected String clasCar() {
        return "is a Sport car";
    }
}