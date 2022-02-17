package Zajavka.week_05.day_24;


public class Dog extends Animal {
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void changeName(final String name) {
    }
}
