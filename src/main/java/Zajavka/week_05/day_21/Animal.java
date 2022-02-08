package Zajavka.week_05.day_21;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.setName(name);
    }

    public abstract String getName();

    public void setName(String name) {
        if (name == null) {
            this.name = "unknown";
            return;
        }
        this.name = name;
    }
}
