package Zajavka.week_07.day_35;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            someOtherMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void someOtherMethod() throws IOException {
        String someVariable = null;
        someVariable.toString();
    }
}
