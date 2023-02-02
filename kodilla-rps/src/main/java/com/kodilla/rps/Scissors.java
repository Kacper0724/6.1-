package com.kodilla.rps;

public class Scissors implements Object {
    public String getObjectName() {
        return " choose 3 - Scissors";
    }

    @Override
    public String toString() {
        return getObjectName();
    }
}
