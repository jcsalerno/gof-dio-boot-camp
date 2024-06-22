package com.exemplos.padroesdeprojeto;

public class Order {
    private String productName;
    private double amount;

    public Order(String productName, double amount) {
        this.productName = productName;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getAmount() {
        return amount;
    }
}
