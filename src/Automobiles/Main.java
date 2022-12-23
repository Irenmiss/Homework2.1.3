package Automobiles;

import Transport.Bus;
import Transport.Cars;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("Lada Granta", "", 1.5, "жёлтый", 2015, 120, "Россия", "", "Седан", "а111а111", 5, "", new Cars.Key(true, false));
        Cars car2 = new Cars("Audi A8", "50 L TDI quattro", 3, "чёрный", 2020, 150, "Германия", "Автомат", "Седан", "а222аа222", 5, "", new Cars.Key());
        Cars car3 = new Cars("BMW", "Z8", 3, "чёрный", 2021, 150, "Германия", "Автомат", "Седан", "аа333аа333", 4, "", new Cars.Key(true, true));
        Cars car4 = new Cars("Kia", "Sportage 4-го поколени", 2.4, "красный", 2018, 140, "Южная Корея", "Механика", "Седан", "дд555дд555", 5, "", new Cars.Key());
        Cars car5 = new Cars("Hyundai", "Avante", 1.6, "оранжевый", 2016, 130, "Южная Корея", "Механика", "Седан", "лл999л999", 5, "", new Cars.Key(false, true));
        Bus bus1 = new Bus("ЛиАЗ", "21", "жёлтый", 2000, "Россия", 120);
        Bus bus2 = new Bus("Мерседес", "33", "серебристый", 2015, "Германия", 130);
        Bus bus3 = new Bus("ПАЗ", "66", "белый", 2000, "Россия", 120);
        car1.CarsDescription();
        car2.CarsDescription();
        car3.CarsDescription();
        car4.CarsDescription();
        car5.CarsDescription();
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}
