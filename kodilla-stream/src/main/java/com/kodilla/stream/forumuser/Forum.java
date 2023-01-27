package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> users = new ArrayList<>();
    public Forum() {
        users.add(new ForumUser(001, "JohnS", 'M', LocalDate.of(1990, 8, 14), 5));
        users.add(new ForumUser(002, "JessicaM", 'F', LocalDate.of(2000, 2, 25), 0));
        users.add(new ForumUser(003, "JoeO", 'M', LocalDate.of(2004, 4, 19), 10));
        users.add(new ForumUser(004, "MichaelP", 'M', LocalDate.of(1980, 7, 20), 11));
        users.add(new ForumUser(005, "AimeeT", 'F', LocalDate.of(2002, 3, 24), 20));
        users.add(new ForumUser(006, "RyanM", 'M', LocalDate.of(2000, 6, 26), 1));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(users);
    }
}
