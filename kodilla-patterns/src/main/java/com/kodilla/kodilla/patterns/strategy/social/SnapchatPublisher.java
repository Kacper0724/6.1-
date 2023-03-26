package com.kodilla.kodilla.patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "This is a snap from Snapchat";
    }
}
