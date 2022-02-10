package Zajavka.week_05.day_22a;

public class Ostrich implements Animal, Markerable {

    @Override
    public void run() {
        System.out.println("I am ostrich and running");
    }

    @Override
    public void swim() {
        System.out.println("I am ostrich and swimming");
    }

    @Override
    public void fly() {
        System.out.println("I wish I could fly");
    }
}
