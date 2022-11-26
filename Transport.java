import static zoo.ValidateUtils.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double maxSpeed;

    public Transport(String color, double maxSpeed) {
        this("Данные не корректные", "Данные не корректные", 2000,
                "Данные не корректные", color, maxSpeed);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        this(brand, model, productionYear, productionCountry, color, 0);
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, double maxSpeed) {
        this(brand, model, productionYear, productionCountry, "Данные не корректные", maxSpeed);
    }


    public Transport(String brand, String model, int productionYear, String productionCountry,
                     String color, double maxSpeed) {

        this.brand = validateString(brand);
        this.model = validateString(model);
        this.productionYear = validateNum(productionYear);
        this.productionCountry = validateString(productionCountry);

        this.color = validateString(color);
        this.maxSpeed = validateDoubleNum(maxSpeed);
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = validateString(color);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = validateDoubleNum(maxSpeed);
    }

    public void showCharacteristics() {
        System.out.println(toString());
    }
}
