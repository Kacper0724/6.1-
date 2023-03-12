package com.kodilla.good.patterns.challenges.food2door.products;

import com.kodilla.good.patterns.challenges.food2door.shops.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.shops.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.shops.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.shops.Shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private final List<Product> productList = new ArrayList<>();
    private final Map<Integer, Shop> MapOfProductsInShop = new HashMap<>();

    public ProductRepository() {
        Shop extraFoodShop = new ExtraFoodShop();
        Shop glutenFreeShop = new GlutenFreeShop();
        Shop healthyShop = new HealthyShop();

        productList.add(new FoodProducts(1, "Bread", "Bakery products", 7.99, false));
        productList.add(new FoodProducts(2, "Pasta", "Cereal products", 3.99, false));
        productList.add(new FoodProducts(3, "Onion", "Vegetables", 2.50, true));
        productList.add(new FoodProducts(4, "Oatmeal", "Cereal products", 6.99, true));
        productList.add(new FoodProducts(5, "Wholemeal bread", "Bakery products", 8.99, false));
        productList.add(new FoodProducts(6, "Banana", "Fruits", 6.49, true));

        MapOfProductsInShop.put(productList.get(0).getProductID(), extraFoodShop);
        MapOfProductsInShop.put(productList.get(1).getProductID(), extraFoodShop);
        MapOfProductsInShop.put(productList.get(2).getProductID(), glutenFreeShop);
        MapOfProductsInShop.put(productList.get(3).getProductID(), glutenFreeShop);
        MapOfProductsInShop.put(productList.get(4).getProductID(), healthyShop);
        MapOfProductsInShop.put(productList.get(5).getProductID(), healthyShop);
    }

    public Shop getProductShop(int productID) {
        return MapOfProductsInShop.get(productID);
    }

    public Product getProductFromRepository(int productID) {
        return productList.stream()
                .filter(product -> product.getProductID() == productID)
                .findAny().orElseThrow(IllegalArgumentException::new);
    }
}
