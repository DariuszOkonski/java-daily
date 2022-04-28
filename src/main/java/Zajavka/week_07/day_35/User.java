package Zajavka.week_07.day_35;

public class User {
    private final int age;

    public User(int age) {
        if(age < 21) {
            throw new RuntimeException("You are to young: " + age);
        }
        this.age = age;
    }

    public void intorduce() {
        System.out.println("HI, I have: " + this.age);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
