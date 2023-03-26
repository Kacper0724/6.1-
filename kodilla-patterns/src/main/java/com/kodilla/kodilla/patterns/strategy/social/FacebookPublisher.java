package com.kodilla.kodilla.patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "This is a Facebook post";
    }
}
