package Zajavka.week_05.day_22a;

public class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("I am cat and running");
    }

    @Override
    public void swim() {
        System.out.println("I am cat and swimming");
    }

    @Override
    public void fly() {
        System.out.println("I am cat and flying");
    }
}
