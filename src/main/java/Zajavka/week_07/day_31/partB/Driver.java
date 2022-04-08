package Zajavka.week_07.day_31.partB;

public class Driver {
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws DrivingException {
        if(age < 18)
            throw new DrivingException("You can not drive when you are below 18");
        this.age = age;
    }
}
