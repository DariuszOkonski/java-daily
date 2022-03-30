package Zajavka.week_07.day_31;

public class Main {
    public static void main(String[] args)  {

        try {
            printSomething("throw");
        } catch (Exception e) {
            System.out.println("Exception was thrown: " + e.getMessage());
        }

        try {
            printSomething("something");
        } catch (MyException e) {
            e.printStackTrace();
        }


    }

    private static void printSomething(final String input) throws MyException {
        if("Throw".equalsIgnoreCase(input)) {
            throw new MyException();
        } else {
            System.out.println(input);
        }
    }
}
