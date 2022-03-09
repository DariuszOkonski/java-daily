package Zajavka.week_06.day_26.summary;

public class Main {
    public static void main(String[] args) {

        Animal animal = Animal.GIRAFFE;

        switch (animal) {
            case SHARK:
                System.out.println("Ok, its a shark");
                break;
            case GIRAFFE:
                System.out.println("I am a giraffe");
                break;
            case FROG:
            case REINDEER:
            case CROCODILE:
                System.out.println("We are crazy animals");
                break;
            default:
                System.out.println("Don't have such an option");
                break;
        }

        if(Animal.SHARK.equals(animal)) {

        } else {

        }
    }
}
