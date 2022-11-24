public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
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

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }

        if (productionYear > 0) {
            this.productionYear = productionYear;
        }

        if (productionCountry != null && !productionCountry.isEmpty() && !productionCountry.isBlank()) {

            this.productionCountry = productionCountry;
        }


        setColor(color);
        setMaxSpeed(maxSpeed);
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

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Данные не корректные";
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }
    public void showCharacteristics() {
        System.out.println(toString());
    }
}
