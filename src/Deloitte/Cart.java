package Deloitte;

import java.util.*;

/*
 Question 5: Shopping Cart API

 Problem Statement:
 Design a shopping cart that handles:
 - Quantities
 - Product-level discounts
 - Cart-level discounts

 Approach:
 - Product: ID, name, price, discount
 - CartItem: product + quantity
 - Cart: list of items + cart-level discount
 - Product discount applied at item level
 - Cart discount applied after subtotal
*/

// Represents a product with an optional discount
class Product {
    String id, name;
    double price, discount; // discount in percentage

    public Product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = Math.max(price, 0); // prevent negative prices
        this.discount = Math.max(discount, 0); // prevent negative discounts
    }

    public double getDiscountedPrice() {
        return price * (1 - discount / 100);
    }
}

// Represents an item in the cart with quantity
class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = Math.max(quantity, 1); // quantity should be at least 1
    }

    public double getSubtotal() {
        return product.getDiscountedPrice() * quantity;
    }
}

// Represents the shopping cart
public class Cart {
    private final List<CartItem> items = new ArrayList<>();
    private double cartDiscount = 0.0;

    public void addItem(Product p, int qty) {
        items.add(new CartItem(p, qty));
    }

    public void applyCartDiscount(double discountAmount) {
        this.cartDiscount = Math.max(discountAmount, 0); // prevent negative discount
    }

    public double getSubtotal() {
        return items.stream()
            .mapToDouble(CartItem::getSubtotal)
            .sum();
    }

    public double getTotal() {
        double subtotal = getSubtotal();
        return Math.max(0, subtotal - cartDiscount); // total can't be negative
    }

    // Example usage
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 1000, 10); // 10% discount
        Product p2 = new Product("P002", "Mouse", 50, 5); // 5% discount

        Cart cart = new Cart();
        cart.addItem(p1, 1);
        cart.addItem(p2, 2);

        System.out.println("Subtotal: $" + cart.getSubtotal());

        cart.applyCartDiscount(50); // $50 off
        System.out.println("Total after cart discount: $" + cart.getTotal());
    }
}
