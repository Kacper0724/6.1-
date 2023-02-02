package com.kodilla.rps;

public class Rock implements Object {
    public String getObjectName() {
        return " choose 1 - Rock";
    }

    @Override
    public String toString() {
        return getObjectName();
    }
}
