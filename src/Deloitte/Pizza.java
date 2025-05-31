package Deloitte;

import java.util.*;


/*
 Question 4: Pizza Price Calculation
Problem Statement
Calculate pizza price based on base, size, toppings, and apply discounts (date-based or sale-based).

Approach

Base Pricing:

Define prices for bases and sizes.

Toppings: fixed price per topping.

Discounts:

Apply percentage discounts based on conditions (e.g., Tuesday discount).


 * */

class Pizza {
    String base, size;
    List<String> toppings;
    Pizza(String base, String size, List<String> toppings) {
        this.base = base; this.size = size; this.toppings = toppings;
    }
}

public class PizzaPricing {
    private static final Map<String, Double> BASE_PRICES = Map.of(
        "regular", 5.0, "thinCrust", 6.0
    );
    private static final Map<String, Double> SIZE_MULTIPLIERS = Map.of(
        "medium", 1.0, "regular", 1.2, "large", 1.5
    );
    private static final double TOPPING_PRICE = 0.5;
    
    public static double calculatePrice(Pizza pizza) {
        double basePrice = BASE_PRICES.getOrDefault(pizza.base, 0.0);
        double sizeMultiplier = SIZE_MULTIPLIERS.getOrDefault(pizza.size, 1.0);
        double toppingsPrice = pizza.toppings.size() * TOPPING_PRICE;
        return basePrice * sizeMultiplier + toppingsPrice;
    }
    
    public static double calculatePrice(Pizza pizza, boolean isTuesday, boolean saleAbove20, double total) {
        double price = calculatePrice(pizza);
        if (isTuesday) price *= 0.8;
        if (saleAbove20 && total > 20) price *= 0.9;
        return price;
    }
}