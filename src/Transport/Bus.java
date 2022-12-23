package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String bodyColor, int year, String country, int maxSpeed) {
        super(brand, model, bodyColor, year, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus. Brand: " + getBrand() +
                ", model: " + getModel() +
                ", color: " + getBodyColor() +
                ", year of production: " + getYear() +
                ", country of production: " + getCountry() +
                ", maximum Speed: " + getMaxSpeed();
    }
}
