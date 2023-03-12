package com.kodilla.good.patterns.challenges.food2door.shops;

import com.kodilla.good.patterns.challenges.food2door.products.Product;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Shop {
    boolean process(LocalDate orderDate, LocalTime orderTime, final Product product, final int quantity);
}
