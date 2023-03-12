package com.kodilla.good.patterns.challenges.food2door.products;

public class FoodProducts implements Product {
    private final int productID;
    private final String productName;
    private final String productType;
    private final double productPrice;
    private final boolean isGlutenFree;

    public FoodProducts(int productID, final String productName, String productType, double productPrice, boolean isGlutenFree) {
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.isGlutenFree = isGlutenFree;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodProducts that = (FoodProducts) o;

        if (Double.compare(that.productPrice, productPrice) != 0) return false;
        if (isGlutenFree != that.isGlutenFree) return false;
        if (productID != that.productID) return false;
        if (!productName.equals(that.productName)) return false;
        return productType.equals(that.productType);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName.hashCode();
        result = 31 * result + productType.hashCode();
        temp = Double.doubleToLongBits(productPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isGlutenFree ? 1 : 0);
        result = 31 * result + productID;
        return result;
    }

    public String toString() {
        return "Product name: " + productName +
                "Product type: " + productType +
                "Product price: " + productPrice +
                "Product gluten free: " + isGlutenFree +
                "Product ID: " + productID;
    }
}
