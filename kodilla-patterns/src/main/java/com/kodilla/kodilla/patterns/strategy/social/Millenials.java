package com.kodilla.kodilla.patterns.strategy.social;

public final class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
