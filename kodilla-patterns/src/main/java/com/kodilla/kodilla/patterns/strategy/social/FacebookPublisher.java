package com.kodilla.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "This is a Facebook post";
    }
}
