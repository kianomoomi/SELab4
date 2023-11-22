package com.company;

public class DeliveredState implements State{
    @Override
    public void handleRequest() {
        System.out.println("The product has been delivered");
        System.exit(0);
    }
}
