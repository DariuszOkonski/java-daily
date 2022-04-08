package Zajavka.week_07.day_31.partB;

public class Main {
    public static void main(String[] args) {
        Driver andrzej = new Driver(36);
        Driver ryszard = new Driver(20);



        try {
            ryszard.setAge(17);
        } catch (DriverToYoungException e) {
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
