package com.kodilla.good.patterns.challenges.shop.user;

public class User {
    private final String firstName;
    private final String sureName;

    public User(final String firstName, final String sureName) {
        this.firstName = firstName;
        this.sureName = sureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSureName() {
        return sureName;
    }
}
