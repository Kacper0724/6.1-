package com.kodilla.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("John Smith");
        User yGeneration = new YGeneration("Peter Taylor");
        User zGeneration = new ZGeneration("Michael Davies");
        //When
        String millenialSocialPublisher = millenials.sharePost();
        System.out.println("John Smith: \n" +
                millenialSocialPublisher);
        String yGenerationSocialPublisher = yGeneration.sharePost();
        System.out.println("Peter Taylor: \n" +
                yGenerationSocialPublisher);
        String zGenerationSocialPublisher = zGeneration.sharePost();
        System.out.println("Michael Davies: \n" +
                zGenerationSocialPublisher);
        //Then
        assertEquals("This is a Twitter post", millenials.sharePost());
        assertEquals("This is a Facebook post", yGeneration.sharePost());
        assertEquals("This is a snap from Snapchat", zGeneration.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("John Smith");
        User yGeneration = new YGeneration("Peter Taylor");
        User zGeneration = new ZGeneration("Michael Davies");
        //When
        //Twitter -> Snapchat
        String millenialSocialPublisher = millenials.sharePost();
        System.out.println("John Smith: \n" +
                millenialSocialPublisher);
        millenials.setSocialPublisher(new SnapchatPublisher());
        millenialSocialPublisher = millenials.sharePost();
        System.out.println("John Smith: \n" +
                millenialSocialPublisher);

        //Facebook -> Twitter
        String yGenerationSocialPublisher = yGeneration.sharePost();
        System.out.println("Peter Taylor: \n" +
                yGenerationSocialPublisher);
        yGeneration.setSocialPublisher(new TwitterPublisher());
        yGenerationSocialPublisher = yGeneration.sharePost();
        System.out.println("Peter Taylor: \n" +
                yGenerationSocialPublisher);

        //Snapchat -> Facebook
        String zGenerationSocialPublisher = zGeneration.sharePost();
        System.out.println("Michael Davies: \n" +
                zGenerationSocialPublisher);
        zGeneration.setSocialPublisher(new FacebookPublisher());
        zGenerationSocialPublisher = zGeneration.sharePost();
        System.out.println("Michael Davies: \n" +
                zGenerationSocialPublisher);
        //Then
        assertEquals("This is a snap from Snapchat", millenials.sharePost());
        assertEquals("This is a Twitter post", yGeneration.sharePost());
        assertEquals("This is a Facebook post", zGeneration.sharePost());
    }
}
