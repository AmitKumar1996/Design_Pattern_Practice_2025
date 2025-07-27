package Deloitte;

import java.util.*;

/*
 Question 4: Pizza Price Calculation
 Problem Statement:
 Calculate pizza price based on base, size, toppings, and apply discounts (date-based or sale-based).

 Approach:
 - Define base prices and size multipliers.
 - Toppings: fixed price per topping.
 - Apply discounts: e.g., Tuesday discount (20%), sale discount (10% if total > $20).
*/

// Model class for Pizza
class Pizza {
    String base, size;
    List<String> toppings;

    public Pizza(String base, String size, List<String> toppings) {
        this.base = base;
        this.size = size;
        this.toppings = toppings;
    }
}

// Main class for pricing logic
public class PizzaPricing {
    private static final Map<String, Double> BASE_PRICES = Map.of(
        "regular", 5.0,
        "thinCrust", 6.0
    );

    private static final Map<String, Double> SIZE_MULTIPLIERS = Map.of(
        "medium", 1.0,
        "regular", 1.2,
        "large", 1.5
    );

    private static final double TOPPING_PRICE = 0.5;

    // Method to calculate price without discount
    public static double calculatePrice(Pizza pizza) {
        double basePrice = BASE_PRICES.getOrDefault(pizza.base, 0.0);
        double sizeMultiplier = SIZE_MULTIPLIERS.getOrDefault(pizza.size, 1.0);
        double toppingsPrice = pizza.toppings.size() * TOPPING_PRICE;

        return basePrice * sizeMultiplier + toppingsPrice;
    }

    // Method to calculate price with optional discounts
    public static double calculatePrice(Pizza pizza, boolean isTuesday, boolean saleAbove20, double total) {
        double price = calculatePrice(pizza);

        if (isTuesday) {
            price *= 0.8; // 20% off
        }

        if (saleAbove20 && total > 20) {
            price *= 0.9; // Additional 10% off
        }

        return price;
    }

    // Example usage
    public static void main(String[] args) {
        List<String> toppings = Arrays.asList("cheese", "pepperoni", "olives");
        Pizza pizza = new Pizza("regular", "large", toppings);

        int[] A= {1,2,3,4,56,7};
        System.out.println(A.length);
        
        double basePrice = calculatePrice(pizza);
        System.out.println("Price without discount: $" + basePrice);

        double discountedPrice = calculatePrice(pizza, true, true, basePrice);
        System.out.println("Price with discount: $" + discountedPrice);
    }
}
