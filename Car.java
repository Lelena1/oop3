import java.time.LocalDate;

public class Car extends Transport {

    public static class Insurance {

        private final LocalDate validityPeriodOfInsurance;
        private double costOfInsurance;
        private String numberOfInsurance;

        public Insurance(LocalDate validityPeriodOfInsurance, double costOfInsurance, String numberOfInsurance) {

            if (validityPeriodOfInsurance == null) {
                this.validityPeriodOfInsurance = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriodOfInsurance = validityPeriodOfInsurance;
            }
            if (costOfInsurance > 0) {
                this.costOfInsurance = costOfInsurance;
            }

            if (numberOfInsurance != null && !numberOfInsurance.isEmpty() && !numberOfInsurance.isBlank() &&
                    numberOfInsurance.length() == 9) {
                this.numberOfInsurance = numberOfInsurance;
            } else {
                this.numberOfInsurance = "номер страховки введен некорректно";
            }

        }


        public Insurance() {
            this(LocalDate.now(), 2000, "111111111");
        }


        public void checkPeriodOfInsurance() {

            if (validityPeriodOfInsurance.isBefore(LocalDate.now()) ||
                    validityPeriodOfInsurance.isEqual(LocalDate.now())) {
                System.out.println("Страховка просрочена. Нужно срочно ехать оформлять новую!");
            } else {
                System.out.println("Страховка действующая");
            }
        }

        public void checkNumberOfInsurance() {
            if (numberOfInsurance.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
            System.out.println("Номер страховки корректный!");
        }

        public LocalDate getValidityPeriodOfInsurance() {
            return validityPeriodOfInsurance;
        }

        public double getCostOfInsurance() {
            return costOfInsurance;
        }

        public String getNumberOfInsurance() {
            return numberOfInsurance;
        }
    }

    public static class Key {
        private final boolean isRemoteEngineStart;
        private final boolean isKeylessAccess;


        public Key(boolean isRemoteEngineStart, boolean isKeylessAccess) {

            this.isRemoteEngineStart = isRemoteEngineStart;

            this.isKeylessAccess = isRemoteEngineStart;
        }

        public Key() {
            this(false, false);
        }

        public boolean getIsRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        public boolean getIsKeylessAccess() {
            return isKeylessAccess;
        }

    }

    private double engineVolume;
    private String transmission;
    private final String bodeType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean isSummerTires;
    private Key key;
    private Insurance insurance;
    String refill;


    //     Дз 1 Задание 3
    public void showCharacteristics() {
        System.out.println(toString());
    }


    // Дз 2 Задание 2

//    transport.Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
//        this.brand = brand;
//        this.model = model;
//        this.engineVolume = engineVolume;
//        this.color = color;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//    }

    //   ДЗ 3 Задание 2 (ООП-1), ДЗ 2 Задание 1 (ООП-2 Инкапсуляция)
    public Car(double engineVolume, int productionYear, String registrationNumber) {
        this("УАЗ", "Патриот", engineVolume, "белый", productionYear, "Россия",
                "Механика", "Внедорожник", registrationNumber,
                5, false, new Key(), new Insurance(), "нет данных");
    }


    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodeType, String registrationNumber,
               int numberOfSeats, boolean isSummerTires, Key key, Insurance insurance, String refill) {
        super(brand, model, productionYear, productionCountry, color);

        if (engineVolume > 0) {

            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 2.7;
        }

        this.transmission = transmission;

        this.bodeType = bodeType;

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank() &&
                registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Регистрационный номер указан неверно";
        }

        this.numberOfSeats = numberOfSeats;


        if (isSummerTires) {
            this.isSummerTires = true;
        }

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

        setRefill(refill);
    }

    @Override
    public void refill() {
        System.out.println("Заправить бензином/дизелем на заправке или зарядить на специальной электропарковке (для электрокаров)");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodeType() {
        return bodeType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getIsSummerTires() {
        return isSummerTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public String getRefill() {
        return refill;
    }

    public void setRefill(String refill) {
        if (refill != null && !refill.isEmpty() && !refill.isBlank()) {
            this.refill = refill;
        }
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {

            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 2.7;
        }
    }

    public void setTransmission(String transmission) {

        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {

            this.transmission = transmission;
        } else {
            this.transmission = "механика";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank() &&
                registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Регистрационный номер указан неверно";
        }
    }

    public void setIsSummerTires(boolean isSummerTires) {
        if (isSummerTires) {
            this.isSummerTires = true;
        } else {
            this.isSummerTires = false;
        }
    }


    public void replaceTires(boolean isSummer) {

        boolean isReplaceTires;

        if ((isSummer == true && isSummerTires == true) || (isSummer == false && isSummerTires == false)) {
            isReplaceTires = false;
            System.out.println("Шины соответствуют сезону");
        }
        System.out.println("Сменить шины на сезонные");
    }

    public boolean isValidationRegNum() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])
                || !Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Автомобиль " + getBrand() + " " + getModel() + ", " + getProductionYear() + " года выпуска, сборка - " +
                getProductionCountry() + ", цвет кузова - " + getColor() + ", объем двигателя - " + engineVolume + " литра, " +
                "коробка передач - " + transmission + ", тип кузова - " + bodeType + ", регистрационный номер: " +
                registrationNumber + ", количество мест - " + numberOfSeats + ", наличие летней резины: " +
                (isSummerTires ? "летняя резина" : "зимняя резина") + ", " + (getKey().isRemoteEngineStart ?
                "удаленный запуск двигателя" : "обычный запуск двигателя") + ", " + (getKey().isKeylessAccess ?
                "бесключевой доступ" : "доступ с ключом") + ", номер страховки - " + getInsurance().numberOfInsurance +
                ", стоимость страховки: " + getInsurance().costOfInsurance + " рублей, срок действия страховки- до " +
                getInsurance().validityPeriodOfInsurance + ", заправка: " + refill + ".";
    }
}

