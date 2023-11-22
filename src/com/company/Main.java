package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the package management system");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Select a shipping strategy: ");
        System.out.println("1. Standard shipping");
        System.out.println("2. Express shipping");
        int shippingChoice = scanner.nextInt();
        ShippingStrategy shippingStrategy;
        if (shippingChoice == 1) {
            shippingStrategy = new StandardShipping();
        } else {
            shippingStrategy = new ExpressShipping();
        }
        State state = new InTransitState(); // default state
        Product product = new Product(weight, shippingStrategy, state);
        while (true) {
            System.out.println("Select an action:");
            System.out.println("1. Change shipping Strategy");
            System.out.println("2. Update package state");
            System.out.println("3. Exit");
            int action = scanner.nextInt();
            if (action == 1) {
                System.out.println("Select a new shipping strategy: ");
                System.out.println("1. Standard shipping");
                System.out.println("2. Express shipping");
                int shipping = scanner.nextInt();
                if (shipping == 1) {
                    product.setShippingStrategy(new StandardShipping());
                } else if (shipping == 2) {
                    product.setShippingStrategy(new ExpressShipping());
                }
            } else if (action == 2) {
                System.out.println("Select the package state:");
                System.out.println("1. In transit");
                System.out.println("2. Delivered");
                int packageState = scanner.nextInt();
                if (packageState == 1) {
                    product.setState(new InTransitState());
                } else if (packageState == 2) {
                    product.setState(new DeliveredState());
                }
            } else if (action == 3) {
                System.exit(0);
            }
            System.out.println("Shipping cost is: " + product.calculatePrice());
            product.getState().handleRequest();
        }
    }
}
