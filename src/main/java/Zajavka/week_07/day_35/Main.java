package Zajavka.week_07.day_35;

public class Main {
    public static void main(String[] args) {
        User user1 = null;
        User user2 = null;

        try {
            user1 = new User(23);
            user1.intorduce();

            user2 = new User(19);
            user2.intorduce();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            user2 = new User(38);
        } finally {
            if((user1 != null) && (user2 != null)) {
                System.out.println(user1.toString());
                System.out.println(user2.toString());
            }
        }

    }
}
