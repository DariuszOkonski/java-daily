package DesignPatterns._01_solid._05_dependencyinversion.ex_1;

public class MySQLDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting to a MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnectiong the MySQL database...");
    }

}
