package Deloitte.OrderDiscountStrategy;

import java.util.function.Function;

public class DiscountExample {
    public static void main(String[] args) {
        Order order = new Order(1000);

        // Flat 10% discount
        Function<Double, Double> flatDiscount = amt -> amt - (amt * 0.10);

        // Conditional discount: 20% if amount > 5000
        Function<Double, Double> tieredDiscount = amt -> amt > 5000 ? amt * 0.80 : amt * 0.95;

        order.applyDiscount(flatDiscount);      // ₹900.0
        order.applyDiscount(tieredDiscount);    // ₹950.0
    }
}