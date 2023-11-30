import java.util.Objects;

public class PassengerMinibus extends Car {
    private int capacity;

    public PassengerMinibus() {
    }

    public PassengerMinibus(int width, int height, double fuelConsumption, int price, int maxSpeed, int capacity) {
        super(width, height, fuelConsumption, price, maxSpeed);
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerMinibus that = (PassengerMinibus) o;
        return capacity == that.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "PassengerMinibus{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", price=" + getPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                ", capacity=" + capacity +
                '}';
    }

    public String nameProfesion() {
        return "bus driver";
    }

    @Override
    protected String clasCar() {
        return "is a passenger minibus";
    }
}