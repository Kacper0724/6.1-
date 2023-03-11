package com.kodilla.good.patterns.challenges.shop.services;

import com.kodilla.good.patterns.challenges.shop.user.User;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Hi, " + user.getFirstName() + " we process your order!");
    }
}
