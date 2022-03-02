package Zajavka.week_06.day_26;

public class Main {
    public static void main(String[] args) {

        Volkswagen volkswagen = getEnum();

        System.out.println(volkswagen.getColors());
        System.out.println(volkswagen.getProductionYear());
        System.out.println(Volkswagen.PASSAT.getColors());
        System.out.println(Volkswagen.PASSAT.getProductionYear());

        switch (volkswagen) {
            case PASSAT:
            case ARTEON:
                System.out.println("Passat or Arteon");
                break;
            case GOLF:
                System.out.println("Golf");
                break;
            case TIGUAN:
            case TUAREG:
                System.out.println("Isn't that a SUV");
                break;

        }


    }

    private static Volkswagen getEnum() {
        return Volkswagen.GOLF;
    }
}
