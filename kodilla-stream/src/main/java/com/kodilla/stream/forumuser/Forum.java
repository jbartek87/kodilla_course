package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Bartek", 'M', LocalDate.of(1987, 11, 11), 200));
        userList.add(new ForumUser(2, "Marek", 'M', LocalDate.of(2001, 10, 9), 0));
        userList.add(new ForumUser(3, "Piotrek", 'M', LocalDate.of(2000, 5, 17), 100));
        userList.add(new ForumUser(4, "Beata", 'F', LocalDate.of(1994, 1, 29), 259));
        userList.add(new ForumUser(5, "Wojciech", 'M', LocalDate.of(1980, 1, 22), 0));
        userList.add(new ForumUser(6, "Irena", 'F', LocalDate.of(1974, 4, 2), 12));
        userList.add(new ForumUser(7, "Olga", 'F', LocalDate.of(2004, 6, 1), 4));
        userList.add(new ForumUser(8, "Pawel", 'M', LocalDate.of(1999, 12, 28), 1));
        userList.add(new ForumUser(9, "Janusz", 'M', LocalDate.of(1950, 12, 5), 50));
        userList.add(new ForumUser(10, "Iza", 'F', LocalDate.of(2010, 7, 14), 33));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
