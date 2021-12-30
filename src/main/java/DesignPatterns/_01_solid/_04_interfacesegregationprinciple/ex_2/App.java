package DesignPatterns._01_solid._04_interfacesegregationprinciple.ex_2;

public class App {
    public static void main(String[] args) {
        ICEO ceo = new CEO();
        ceo.addBonus();
        ceo.salary();
        ceo.makeDecisions();
        ceo.addStocks();
    }
}
