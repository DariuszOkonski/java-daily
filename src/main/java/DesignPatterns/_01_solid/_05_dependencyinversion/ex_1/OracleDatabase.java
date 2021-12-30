package DesignPatterns._01_solid._05_dependencyinversion.ex_1;

public class OracleDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting to a Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnectiong the Oracle database...");
    }

}
