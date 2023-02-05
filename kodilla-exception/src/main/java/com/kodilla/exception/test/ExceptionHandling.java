package com.kodilla.exception.test;

public class ExceptionHandling {
    public void probablyIWillThrowException()  {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.1, 0.2);
        } catch (Exception e) {
            System.out.println("Problem " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}
