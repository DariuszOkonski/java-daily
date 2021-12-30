package DataStructures._06_linkedlists;

public class App {
    public static void main(String[] args) {

        LinkedList<Person> people = new LinkedList<>();
        people.insert(new Person(23, "Adam"));
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michael"));


        people.traverse();

    }
}
