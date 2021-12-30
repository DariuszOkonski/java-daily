package DesignPatterns._01_solid._04_interfacesegregationprinciple.ex_2;

public class Manager implements IManager{
    @Override
    public void salary() {
        System.out.println("Manager: getting the salary");
    }

    @Override
    public void hire() {
        System.out.println("Manager: hiring new employess...");
    }

    @Override
    public void train() {
        System.out.println("Manager: training the employees");
    }

    @Override
    public void addBonus() {
        System.out.println("Manager: adding bonus at the end of year...");
    }
}
