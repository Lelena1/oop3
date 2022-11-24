import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        doHw1Task3();
//        doHw2Task2();
          doHw2Task3Encapsulation();

    }

//    public static void doHw1Task3() {
//
//        System.out.println("Домашнее задание 1 Задание 3");
//        transport.Car lada = new transport.Car();
//        lada.brand = "Lada";
//        lada.model = "Grande";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый";
//        lada.productionCountry = "Россия";
//        lada.productionYear = 2015;
//        lada.showCharacteristics();
//
//        transport.Car audi = new transport.Car();
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "черный";
//        audi.productionCountry = "Германия";
//        audi.productionYear = 2020;
//        audi.showCharacteristics();
//
//        transport.Car bmw = new transport.Car();
//        bmw.brand = "BMW";
//        bmw.model = "Z8";
//        bmw.engineVolume = 3.0;
//        bmw.color = "черный";
//        bmw.productionCountry = "Германия";
//        bmw.productionYear = 2021;
//        bmw.showCharacteristics();
//
//        transport.Car kia = new transport.Car();
//        kia.brand = "KIA";
//        kia.model = "Sportage 4 поколение";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.productionCountry = "Южная Корея";
//        kia.productionYear = 2018;
//        kia.showCharacteristics();
//
//        transport.Car hyundai = new transport.Car();
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый";
//        hyundai.productionCountry = "Южная Корея";
//        hyundai.productionYear = 2016;
//        hyundai.showCharacteristics();
//    }

//    public static void doHw2Task2() {
//
//        transport.Car lada = new transport.Car("Lada", "Grande", 1.7, "желтый",
//                2015, "Россия");
//        transport.Car audi = new transport.Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
//                2020, "Германия");
//        transport.Car bmw = new transport.Car("BMW", "Z8", 3.0, "черный",
//                2021, "Германия");
//        transport.Car kia = new transport.Car("KIA", "Sportage 4 поколение", 2.4, "красный",
//                2018, "Южная Корея");
//        transport.Car hyundai = new transport.Car("Hyundai", "Avante", 1.6, "оранжевый",
//                2016, "Южная Корея");
//
//        lada.showCharacteristics();
//        audi.showCharacteristics();
//        bmw.showCharacteristics();
//        kia.showCharacteristics();
//        hyundai.showCharacteristics();
//    }

    public static void doHw2Task3Encapsulation() {

        Car.Insurance insuranceLada = new Car.Insurance(LocalDate.now(),
                3500.2, "001234567");
        Car.Insurance insuranceAudi = new Car.Insurance(LocalDate.now(),
                4900.10, "001234567");
        Car.Insurance insuranceBmw = new Car.Insurance(LocalDate.now(),
                5600.10, "011234567");
        Car.Insurance insuranceKia = new Car.Insurance(LocalDate.now(),
                4600.80, "021234567");
        Car.Insurance insuranceHyundai = new Car.Insurance(LocalDate.now(),
                6700.20, "031234567");

        System.out.println("\nООП-3. Наследование. ДЗ-1. Задание 1");
        Car lada = new Car("Lada", "Grande", 1.7, "желтый",
                -2015, "Россия", "механика", "седан",
                "А123БВ456", 4, true,
                new Car.Key(true, false), insuranceLada, "бензин");
        Car audi = new Car(-3.0, 2020, "А234БВ567");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германия", "автомат", "внедорожник", "",
                6, true, new Car.Key(true, true), insuranceBmw, "дизель");
        Car kia = new Car("KIA", "Sportage 4 поколение", -2.4, "красный",
                2018, "Южная Корея", "механика", " ",
                "А345АА678", 5, false, new Car.Key(), insuranceKia, "бензин");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея", "механика", "седан",
                "Б123ББ678", 5, false, new Car.Key(false,
                true), insuranceHyundai, "заряжается на электропарковке");

//        Инкапсуляция. Домашнее задание 3 Задание 1 - Вложенный класс Key. Тестирование объектов
//        kia.setKey(new Car.Key(true, true));
//        bmw.setKey(new Car.Key(false, false));
//
//        System.out.println("\nИнкапсуляция. Домашнее задание 3 Задание 1 - Вложенный класс Insurance");
//        System.out.println(insuranceKia.getNumberOfInsurance());
//        System.out.println(insuranceLada.getValidityPeriodOfInsurance());
//        System.out.println(insuranceLada.getNumberOfInsurance());
//        System.out.println(insuranceHyundai.getValidityPeriodOfInsurance());
//        bmw.getInsurance().checkPeriodOfInsurance();
//        lada.getInsurance().checkNumberOfInsurance();

//        System.out.println("\nИнкапсуляция. Домашнее задание 2 - задание 1");
//        тестирование
//        lada.setEngineVolume(-2);
//        lada.setColor("  ");
//        lada.setTransmission("  ");
//        lada.setRegistrationNumber("");
//        audi.setIsSummerTires(false);
//        lada.replaceTires(true);
//        lada.setRegistrationNumber("a123cd456");
//        System.out.println(lada.isValidationRegNum());
//        audi.setRegistrationNumber("ff123g456");
//        System.out.println(audi.isValidationRegNum());


        lada.showCharacteristics();
        audi.showCharacteristics();
        bmw.showCharacteristics();
        kia.showCharacteristics();
        hyundai.showCharacteristics();

        System.out.println("\nООП-3. Наследование. ДЗ-1. Задание 2");
        Train lastochka = new Train("Ласточка", "В-901", 2011,
                "Россия", 301, 3500, 6.5, "Белорусский вокзал",
                "Минск-Пассажирский",11, "дизель");
        Train leningrad = new Train("Ленинград", "Д-125", 2019, "Россия",
                270, 1700, 4.5, "Ленинградский-вокзал",
                "Ленинград-Пассажирский", 8, "дизель");

        lastochka.showCharacteristics();
        leningrad.showCharacteristics();
        lada.refill();
        lastochka.refill();
        Bus liAZ = new Bus("ЛиАЗ", "5256", 2018, "Россия", "зеленый",
                90);
        Bus gaz = new Bus("ГАЗ", "4234", 2022, "Россия", "синий",
                100);
        Bus paz = new Bus("ПАЗ", "4234", 2016, "Россия", "белый",
                8);

       liAZ.showCharacteristics();
       gaz.showCharacteristics();
       paz.showCharacteristics();
        liAZ.refill();
        gaz.refill();
        paz.refill();
    }
}

