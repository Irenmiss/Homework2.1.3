package Automobiles;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars( "Lada Granta", "", 1.7, "жёлтый", 2015, "Россия");
        Cars car2 = new Cars("Audi A8", "50 L TDI quattro", 3, "чёрный", 2020, "Германия");
        Cars car3 = new Cars("BMW", "Z8", 3, "чёрный", 2021, "Германия");
        Cars car4 = new Cars("Kia", "Sportage 4-го поколени", 2.4, "красный", 2018, "Южная Корея");
        Cars car5 = new Cars("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        car1.CarsDescription();
        car2.CarsDescription();
        car3.CarsDescription();
        car4.CarsDescription();
        car5.CarsDescription();

    }
}
