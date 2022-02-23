package Zajavka.week_05.day_25.sandbox;

public final class Kangaroo {
    private final Pauch pauch;
    private final String name;
    private final int age;

    public Kangaroo(Pauch pauch, String name, int age) {
        this.pauch = new Pauch(pauch);
        this.name = name;
        this.age = age;
    }

    public Kangaroo withName(String name) {
        return new Kangaroo(this.pauch, name, this.age);
    }

    public Kangaroo withAge(int age) {
        return new Kangaroo(this.pauch, this.name, age);
    }

    public Pauch getPauch() {
        return pauch;
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "pauch=" + pauch +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
