package Zajavka.week_06.day_30;

public class Parrot {
    private static String name;
    private String surname;

    static  {
        name = "Statyczna Agata";
    }

    {
        name = "Niestatyczna Agata";
        surname = "I Hakuna Mataata";
    }

    public String getName() {
        return name;
    }
}
