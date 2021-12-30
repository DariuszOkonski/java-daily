package DesignPatterns._01_solid._05_dependencyinversion.ex_1;

public class App {
    public static void main(String[] args) {

        DatabaseController databaseController = new DatabaseController(new OracleDatabase());
        databaseController.connect();
        databaseController.disconnect();

    }

}
