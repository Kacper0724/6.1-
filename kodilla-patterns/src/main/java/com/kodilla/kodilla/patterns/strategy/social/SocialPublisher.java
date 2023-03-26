package com.kodilla.kodilla.patterns.strategy.social;

public sealed interface SocialPublisher
        permits FacebookPublisher, SnapchatPublisher, TwitterPublisher {
    String share();
}
