package Zajavka.week_04.day_19.animal2;

public class Animal {
    protected String name;
    protected boolean hasLegs;

    public Animal() {
        this.name = "hello";
    }

    public static Animal makeAnimal() {
        return new Animal();
    }

    public Animal(String name, boolean isReady) {
        this.hasLegs = isReady;
        if(!this.hasLegs)
            return;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", isReady=" + hasLegs +
                '}';
    }
}
