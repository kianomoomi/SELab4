package com.company;

public class Product {
    private double weight;
    private ShippingStrategy shippingStrategy;
    private State state;

    public Product(double weight, ShippingStrategy shippingStrategy, State state) {
        this.weight = weight;
        this.shippingStrategy = shippingStrategy;
        this.state = state;
    }
    public double calculatePrice() {
        return this.shippingStrategy.calculateCost(this.weight);
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double getWeight() {
        return weight;
    }

    public ShippingStrategy getShippingStrategy() {
        return this.shippingStrategy;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
