package Zajavka.week_04.day_16;

public class Tuna {
    public String name = "Tunek";

    public void swim() {
        System.out.println("Swimming: " + this.name);
    }

    @Override
    public String toString() {
        return "Tuna{" +
                "name='" + name + '\'' +
                '}';
    }
}
