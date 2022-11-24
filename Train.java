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

        if (departureStation != null && !departureStation.isEmpty() && !departureStation.isBlank()) {
            this.departureStation = departureStation;
        }

        if (arrivalStation != null && !arrivalStation.isEmpty() && !arrivalStation.isBlank()) {
            this.arrivalStation = arrivalStation;
        } else {
            this.arrivalStation = "данные не корректные";
        }
        setTravelPrice(travelPrice);
        setTravelTime(travelTime);
        setWagonsCount(wagonsCount);
        setRefill(refill);
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

        if (travelPrice > 0) {
            this.travelPrice = travelPrice;
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {

        if (travelTime > 0) {
            this.travelTime = travelTime;
        }
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

        if (refill != null && !refill.isEmpty() && !refill.isBlank()) {
            this.refill = refill;
        }
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(int wagonsCount) {

        if (wagonsCount > 0) {
            this.wagonsCount = wagonsCount;
        }
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
