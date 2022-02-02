package Zajavka.week_04.day_18;

public class Building {
    public String address = "Warminska 25";
    public int number = 12;
    public Flat flat = new Flat();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Building{");
        sb.append("address='").append(address).append('\'');
        sb.append(", number=").append(number);
        sb.append(", flat=").append(flat);
        sb.append('}');
        return sb.toString();
    }
}
