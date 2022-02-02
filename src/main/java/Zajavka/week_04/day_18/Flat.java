package Zajavka.week_04.day_18;

public class Flat {
    public int noOfRooms = 3;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Flat{");
        sb.append("noOfRooms=").append(noOfRooms);
        sb.append('}');
        return sb.toString();
    }
}
