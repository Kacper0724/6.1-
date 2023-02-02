package com.kodilla.rps;

public class Paper implements Object {
    public String getObjectName() {
        return " choose 2 - Paper";
    }

    @Override
    public String toString() {
        return getObjectName();
    }
}
