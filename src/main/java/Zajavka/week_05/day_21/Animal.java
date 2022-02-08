package Zajavka.week_05.day_21;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getAnything() {
        return "anything";
    }

    public abstract String getName();
}
