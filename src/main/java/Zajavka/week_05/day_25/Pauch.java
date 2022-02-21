package Zajavka.week_05.day_25;

public final class Pauch {
    private final int size;

    public Pauch(int size) {
        this.size = size;
    }

    public Pauch(Pauch pauch) {
        this.size = pauch.getSize();
    }

    public int getSize() {
        return size;
    }

    public Pauch setSize(int size) {
        return new Pauch(size);
    }

    @Override
    public String toString() {
        return "Pauch{" +
                "size=" + size +
                '}';
    }
}
