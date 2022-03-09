package Zajavka.week_06.day_26.summary;

public enum Animal {
    REINDEER("How how"),
    SHARK("Shhhr"),
    CROCODILE("Cwap"),
    FROG("Rybyt"),
    GIRAFFE("<eating_leaves>");

    private final String message;

    Animal(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
