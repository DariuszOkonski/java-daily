package Zajavka.week_06.day_26;

public enum Volkswagen implements MyExampleInterface {
    PASSAT("white", 2020) {
        @Override
        public Volkswagen isMissing() {
            return GOLF;
        }
    },
    GOLF("red", 2021) {
        @Override
        public Volkswagen isMissing() {
            return PASSAT;
        }
    },
    ARTEON("green", 2018) {
        @Override
        public Volkswagen isMissing() {
            return GOLF;
        }
    },
    TIGUAN("blue", 2015) {
        @Override
        public Volkswagen isMissing() {
            return TUAREG;
        }
    },
    TUAREG("brown", 2009) {
        @Override
        public Volkswagen isMissing() {
            return TIGUAN;
        }
    };

    private String colors;
    private int productionYear;

    Volkswagen() {
    }

    Volkswagen(String colors, int productionYear) {
        this.colors = colors;
        this.productionYear = productionYear;
    }

    public abstract Volkswagen isMissing();

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
