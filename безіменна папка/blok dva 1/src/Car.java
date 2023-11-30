import java.util.Objects;

public abstract class Car{
    private int width;
    private int height;
    private double fuelConsumption;
    private int price;
    private int maxSpeed;
    public Car() {
    }

    public Car(int width, int height, double fuelConsumption, int price, int maxSpeed) {
        this.width = width;
        this.height = height;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return width == car.width && height == car.height && fuelConsumption == car.fuelConsumption && price == car.price && maxSpeed == car.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, fuelConsumption, price, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car {" +
                "width=" + width +
                ", height=" + height +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String nameProfesion() {
        return "driver";
    }

    protected String clasCar() {
        return "is a defolt car";
    }
}