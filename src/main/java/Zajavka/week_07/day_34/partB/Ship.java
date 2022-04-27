package Zajavka.week_07.day_34.partB;

import java.io.IOException;

public class Ship {
    private String name;

    {
        if(7 == 7)
            throw new IOException();
    }

    public Ship() throws IOException {
        this.name = "no name";
    }

    public Ship(String name) throws IOException {
        this.name = name;
    }
}
