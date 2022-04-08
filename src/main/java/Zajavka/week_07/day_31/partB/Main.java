package Zajavka.week_07.day_31.partB;

public class Main {
    public static void main(String[] args) {
        try {
            exceptionMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void exceptionMethod() throws Exception {
        throw new Exception("My exception message");
    }
}
