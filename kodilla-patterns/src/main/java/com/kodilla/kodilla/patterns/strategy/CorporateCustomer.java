package com.kodilla.kodilla.patterns.strategy;

import com.kodilla.kodilla.patterns.strategy.predictors.BalancedPredictor;

public final class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
