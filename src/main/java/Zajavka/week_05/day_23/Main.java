package Zajavka.week_05.day_23;

public class Main {
//    20min
    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");

        System.out.println(cat);
//        passByReferenceOrPassByValue(cat);
        byNewObject(cat);

        System.out.println(cat);
    }

    private static void passByReferenceOrPassByValue(Cat cat) {
        cat.setName("Marcin");
        System.out.println(cat);
    }

    private static void byNewObject(Cat cat) {
        cat = new Cat("Piotr");
        System.out.println(cat);
    }
}
