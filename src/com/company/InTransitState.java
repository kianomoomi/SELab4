package com.company;

public class InTransitState implements State {
    @Override
    public void handleRequest() {
        System.out.println("the product is in-transit");
    }
}
