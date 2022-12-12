package Automobiles;

public class Cars {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    Cars(String brand, String model, double engineVolume, String color, int year, String country) {
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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.isEmpty() || color == null) {
            this.color = "белый";
        } else {
            this.color = color;
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

    }

    void CarsDescription() {
        System.out.println(brand + " " + model + " объем двигателя - " + engineVolume + " л, год выпуска - " + year + ", цвет кузова - " + color + ", страна сборки - " + country);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
