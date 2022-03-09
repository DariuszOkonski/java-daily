package Zajavka.week_06.day_26.summary;

public enum Animal implements Voicable {
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
        return this.message;
    }

    @Override
    public String makeVoice() {
        return this.message;
    }
}
