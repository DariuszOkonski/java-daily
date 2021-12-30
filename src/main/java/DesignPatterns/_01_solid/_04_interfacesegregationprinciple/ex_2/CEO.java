package DesignPatterns._01_solid._04_interfacesegregationprinciple.ex_2;

public class CEO implements ICEO{
    @Override
    public void makeDecisions() {
        System.out.println("CEO: making decision");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO: addiing stcks");
    }

    @Override
    public void addBonus() {
        System.out.println("CEO: adding bonus");
    }

    @Override
    public void salary() {
        System.out.println("CEO: getting salary");
    }
}
