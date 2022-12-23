package Transport;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Cars extends Transport {
    private double engineVolume;
    private String gearBox;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String TyresType;
    private Key key;

    public static class Key {
        private final boolean isLaunchRemote;
        private final boolean noKeyAccess;

        public Key(boolean isLaunchRemote, boolean noKeyAccess) {
            this.isLaunchRemote = isLaunchRemote;
            this.noKeyAccess = noKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isLaunchRemote() {
            return isLaunchRemote;
        }

        public boolean isNoKeyAccess() {
            return noKeyAccess;
        }
    }

    public Cars(String brand, String model, double engineVolume, String bodyColor, int year, int maxSpeed, String country, String gearBox, String bodyType, String registrationNumber, int numberOfSeats, String TyresType, Key key) {
        super(brand, model, bodyColor, year, country, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.bodyType = bodyType;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (gearBox.isEmpty() || gearBox.isBlank() || gearBox == null) {
            this.gearBox = "default";
        } else {
            this.gearBox = gearBox;
        }
        if (registrationNumber.isEmpty() || registrationNumber.isBlank() || registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (key == null) {
            this.key = new Key(key.isLaunchRemote, key.noKeyAccess);
        } else {
            this.key = key;
        }
    }

    public void CarsDescription() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л, год выпуска - " + getYear() + ", цвет кузова - " + getBodyColor() + ", страна сборки - " + getCountry() + ", коробка передач - " + getGearBox() + ", максимальная скорость - " + getMaxSpeed() + " км/ч" + ", тип кузова - " + getBodyType() + ", регистрационный номер - " + getRegistrationNumber() + ", количество мест - " + getNumberOfSeats() + ", тип шин - " + defineTyreType() + ", количество мест - " + getNumberOfSeats());
        if (getKey().noKeyAccess == true) {
            System.out.println("Опция бесключевого доступа: есть.");
        } else {
            System.out.println("Опция бесключевого доступа: нет.");
        }
        if (getKey().isLaunchRemote == true) {
            System.out.println("Опция удалённого запуска двигателя: есть.");
        } else {
            System.out.println("Опция удалённого запуска двигателя: нет.");
        }
    }

    public String defineTyreType() {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        if (month == 1 || month == 2 || month == 3 || month == 12 || month == 11 || month == 10) {
            return "Зимняя";
        } else {
            return "Летняя";
        }
    }

    public boolean isRegistrationNumberCorrect() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit((chars[1])) || !Character.isDigit((chars[2])) || !Character.isDigit((chars[3])) || !Character.isDigit((chars[6])) || !Character.isDigit((chars[7])) || !Character.isDigit((chars[8]))) {
            return false;
        }
        return true;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        if (gearBox == null) {
            this.gearBox = "Механика";
        } else {
            this.gearBox = gearBox;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTyresType() {
        return TyresType;
    }

    public void setTyresType(String tyresType) {
        TyresType = tyresType;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "engineVolume=" + getEngineVolume() +
                ", gearBox='" + getGearBox() + '\'' +
                ", bodyType='" + getBodyType() + '\'' +
                ", registrationNumber='" + getRegistrationNumber() + '\'' +
                ", numberOfSeats=" + getNumberOfSeats() +
                ", TyresType='" + getTyresType() + '\'' +
                ", key=" + getKey() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cars cars = (Cars) o;
        return Double.compare(cars.engineVolume, engineVolume) == 0 && numberOfSeats == cars.numberOfSeats && Objects.equals(gearBox, cars.gearBox) && Objects.equals(bodyType, cars.bodyType) && Objects.equals(registrationNumber, cars.registrationNumber) && Objects.equals(TyresType, cars.TyresType) && Objects.equals(key, cars.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, gearBox, bodyType, registrationNumber, numberOfSeats, TyresType, key);
    }
}

