package Zajavka.week_08.day_40;

import java.util.ArrayList;
import java.util.List;

public final class Cat {
    private final List<String> friendsNames;

    public Cat(List<String> friendsNames) {
        this.friendsNames = friendsNames;
    }

    public List<String> getFriendsNames() {
        return new ArrayList<>(friendsNames);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "friendsNames=" + friendsNames +
                '}';
    }
}
