import static zoo.ValidateUtils.*;

public class Train extends Transport {

    double travelPrice;
    double travelTime;
    String departureStation;
    String arrivalStation;
    int wagonsCount;
    String refill;

    public Train(String brand, String model, int productionYear, String productionCountry) {
        this(brand, model, productionYear, productionCountry, 0, 0, 0,
                "Данные не корректные", "Данные не корректные", 10, "дизель");
    }

    public Train(String brand, String model, int productionYear, String productionCountry, double maxSpeed,
                 double travelPrice, double travelTime, String departureStation, String arrivalStation,
                 int wagonsCount, String refill) {
        super(brand, model, productionYear, productionCountry, maxSpeed);

        this.departureStation = validateString(departureStation);
        this.arrivalStation = validateString(arrivalStation);
        this.travelPrice = validateDoubleNum(travelPrice);
        this.travelTime = validateDoubleNum(travelTime);
        this.wagonsCount = validateNum(wagonsCount);
        this.refill = validateString(refill);
    }

    @Override
    public void refill() {
        System.out.println("Заправить дизелем");
    }

    public void showCharacteristics() {
        System.out.println(toString());
    }


    public double getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(double travelPrice) {

        this.travelPrice = validateDoubleNum(travelPrice);
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {

        this.travelTime = validateDoubleNum(travelTime);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public String getRefill() {
        return refill;
    }

    public void setRefill(String refill) {

        this.refill = validateString(refill);
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(int wagonsCount) {

        this.wagonsCount = validateNum(wagonsCount);
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", " + getProductionYear() + " года, страна выпуска - " +
                getProductionCountry() + ", максимальная скорость передвижения - " + getMaxSpeed() + ", " +
                "станция отправления: " + getDepartureStation() + ", станция прибытия: " + getArrivalStation() +
                ", время в пути: " + getTravelTime() + "ч. Цена поездки: " + getTravelPrice() + " рублей, в поезде "
                + getWagonsCount() + " вагонов, заправка: " + refill + ".";
    }
}
