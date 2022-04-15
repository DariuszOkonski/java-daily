package Zajavka.week_07.day_33.Part_B;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        if(name == null){
            throw new InvalidAnimalNameException("Provided name is null");
        }

        this.name = name;
    }
}
