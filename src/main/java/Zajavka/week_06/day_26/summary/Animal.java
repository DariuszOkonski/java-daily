package Zajavka.week_06.day_26.summary;

public enum Animal implements Voicable {
    REINDEER("How how") {
        @Override
        public String sing() {
            return "hi";
        }
    },
    SHARK("Shhhr") {
        @Override
        public String sing() {
            return "hi";
        }
    },
    CROCODILE("Cwap") {
        @Override
        public String sing() {
            return "hi";
        }
    },
    FROG("Rybyt") {
        @Override
        public String sing() {
            return "hi";
        }
    },
    GIRAFFE("<eating_leaves>") {
        @Override
        public String sing() {
            return "hi";
        }
    };

    private final String message;

    Animal(String message) {
        this.message = message;
    }

    public abstract String sing();

    public String getMessage() {
        return this.message;
    }

    @Override
    public String makeVoice() {
        return this.message;
    }
}
