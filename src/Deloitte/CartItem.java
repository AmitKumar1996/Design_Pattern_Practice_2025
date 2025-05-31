package Deloitte;

import java.util.*;



/*
 Question 5: Shopping Cart API
Problem Statement
Design a shopping cart that handles quantities, product-level discounts, and cart-level discounts.

Approach

Classes:

Product: ID, name, price, discount.

CartItem: Product + quantity.

Cart: List of items + cart-level discount.

Discount Handling:

Product discount applied at item level.

Cart discount applied after subtotal.


 * */

class Product {
    String id, name;
    double price, discount;
    Product(String id, String name, double price, double discount) {
        this.id = id; this.name = name;
        this.price = price; this.discount = discount;
    }
    double getDiscountedPrice() {
        return price * (1 - discount / 100);
    }
}

class CartItem {
    Product product;
    int quantity;
    CartItem(Product product, int quantity) {
        this.product = product; this.quantity = quantity;
    }
    double getSubtotal() {
        return product.getDiscountedPrice() * quantity;
    }
}

class Cart {
    List<CartItem> items = new ArrayList<>();
    double cartDiscount = 0;
    
    void addItem(Product p, int qty) {
        items.add(new CartItem(p, qty));
    }
    
    void applyCartDiscount(double discount) {
        this.cartDiscount = discount;
    }
    
    double getTotal() {
        double subtotal = items.stream()
            .mapToDouble(CartItem::getSubtotal)
            .sum();
        return Math.max(0, subtotal - cartDiscount);
    }
}