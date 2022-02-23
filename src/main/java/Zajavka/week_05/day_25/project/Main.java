package Zajavka.week_05.day_25.project;

import Zajavka.week_05.day_25.project.person.Consumer;
import Zajavka.week_05.day_25.project.person.ConsumingMan;
import Zajavka.week_05.day_25.project.person.Producer;
import Zajavka.week_05.day_25.project.person.ProducingMan;
import Zajavka.week_05.day_25.project.product.Food;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Main foodFactory = new Main();
        foodFactory.run();

    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[]{
                new Producer("Alicja", "Zupowa"),
                new Producer("Krzysztof", "Cistkarski")
        };

        ConsumingMan[] consumingPeople = new ConsumingMan[]{
            new Consumer("Rafał", "Pożeracz"),
            new Consumer("Angelika", "Zajadacz")
        };

        int counter = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                counter++;
            }
        }

        Food[] foods = new Food[counter];
        int index = 0;

        String[] choice = new String[] {
                "soup", "chocolate", "sandwich", "soup"
        };

        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {

                Food food = producingPerson.produce(choice[index], consumingPerson);
                foods[index] = food;
                index++;
            }
        }

        System.out.println("PRINTING FOOD");
        for (Food food : foods) {
            System.out.println(food);
        }
    }
}
