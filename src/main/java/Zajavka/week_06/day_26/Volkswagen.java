package Zajavka.week_06.day_26;

public enum Volkswagen {
    PASSAT("white", 2020),
    GOLF("red", 2021),
    ARTEON("green", 2018),
    TIGUAN("blue", 2015),
    TUAREG("brown", 2009);

    private String colors;
    private int productionYear;

    Volkswagen(String colors, int productionYear) {
        this.colors = colors;
        this.productionYear = productionYear;
    }

    public String getColors() {
        return colors;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
