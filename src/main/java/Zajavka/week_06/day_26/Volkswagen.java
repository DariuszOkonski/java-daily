package Zajavka.week_06.day_26;

public enum Volkswagen implements MyExampleInterface {
    PASSAT("white", 2020),
    GOLF("red", 2021),
    ARTEON("green", 2018),
    TIGUAN("blue", 2015),
    TUAREG("brown", 2009);

    private String colors;
    private int productionYear;

    Volkswagen() {
    }

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

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public void doSomething() {
        System.out.println("do something: " + this.getProductionYear());
    }
}
