package Zajavka.week_03._10;

public class Main {
    public static void main(String[] args) {
//        externalMethod(method1() + method2(method3() + method4()));

        Cat cat1 = new Cat();
        Cat cat2 = cat1;

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
    }

    private static int method2(int number) {
        System.out.println("method2");
        return 2;
    }

    private static int method4() {
        System.out.println("method4");
        return 4;
    }

    private static int method3() {
        System.out.println("method3");
        return 3;
    }

    private static int method1() {
        System.out.println("method1");
        return 1;
    }

    public static void externalMethod(int arg) {
        System.out.println("externalMethod");
    }

}
