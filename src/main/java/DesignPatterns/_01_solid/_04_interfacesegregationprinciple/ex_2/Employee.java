package DesignPatterns._01_solid._04_interfacesegregationprinciple.ex_2;

public class Employee implements IEmployee{
    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }
}
