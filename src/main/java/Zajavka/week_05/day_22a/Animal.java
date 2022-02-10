package Zajavka.week_05.day_22a;

public interface Animal extends Swimmable, Flyable {
    public static final String name = "dariusz";

    void run();

    void breathe();

    default void live() {
        this.run();
        this.breathe();
    }
}
