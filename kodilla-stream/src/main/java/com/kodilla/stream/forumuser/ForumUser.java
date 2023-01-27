package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int ID;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int postsPublished;

    public ForumUser(int ID, String userName, char sex, LocalDate dateOfBirth, int postsPublished) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsPublished = postsPublished;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsPublished() {
        return postsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsPublished=" + postsPublished +
                '}';
    }
}
