import java.util.Objects;

public class Truck extends Car {
    private int workWeight;

    public Truck() {
    }

    public Truck(int width, int height, double fuelConsumption, int price, int maxSpeed, int workWeight) {
        super(width, height, fuelConsumption, price, maxSpeed);
        this.workWeight = workWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return workWeight == truck.workWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workWeight);
    }

    public int getWorkWeight() {
        return workWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", price=" + getPrice() +
                ", maxSpeed=" + getMaxSpeed() +
                ", worfWeight=" + workWeight +
                '}';
    }

    public String nameProfesion() {
        return "trucker";
    }

    @Override
    protected String clasCar() {
        return "is a truk";
    }
}