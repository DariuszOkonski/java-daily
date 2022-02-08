package Zajavka.week_05.day_21;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.setBrand(brand);
        this.setModel(model);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            this.brand = "unknown";
            return;
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = "unknown";
            return;
        }
        this.model = model;
    }
}
