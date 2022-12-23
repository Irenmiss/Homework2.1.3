package Transport;

import java.util.Objects;

public class Transport {
    private final String brand;
    private final String model;
    private String bodyColor;
    private final int year;
    private final String country;
    private int maxSpeed;

    public Transport(String brand, String model, String bodyColor, int year, String country, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (brand.isEmpty() || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.isEmpty() || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (bodyColor.isEmpty() || bodyColor == null) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country.isEmpty() || country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 130;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty()) {
            this.bodyColor = "Белый";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 130;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxSpeed == transport.maxSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(bodyColor, transport.bodyColor) && Objects.equals(country, transport.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, bodyColor, year, country, maxSpeed);
    }
}
