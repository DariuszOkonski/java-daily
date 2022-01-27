package Zajavka.week_04.day_17;

import java.util.Objects;

public class Calculator {

    public String name;

    public Calculator(String model) {
        this.name = model;
    }

    public void calculate(String model) {
        System.out.println(this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Calculator that = (Calculator) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
