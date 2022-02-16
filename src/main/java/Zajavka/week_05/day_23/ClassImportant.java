package Zajavka.week_05.day_23;

public class ClassImportant {
    private Interface1 interface1;

    public ClassImportant(Interface1 interface1) {
        this.interface1 = interface1;
    }

    public void doSomething() {
        this.interface1.someMethod();
    }
}
