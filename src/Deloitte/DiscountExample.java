package Deloitte;

import java.util.*;

class Item {
    int id;
    String name;
    String category;
    double price;

    public Item(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void applyDiscount(Map<String, Double> discountMap) {
        if (discountMap.containsKey(category)) {
            double discount = discountMap.get(category); // in percentage
            price = price - (price * discount / 100);
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + String.format("%.2f", price) +
                '}';
    }
}

public class DiscountExample {
    public static void main(String[] args) {
        // Sample items
        List<Item> items = Arrays.asList(
                new Item(101, "iPhone", "Electronics", 70000),
                new Item(102, "T-shirt", "Clothing", 1200),
                new Item(103, "Book", "Education", 500),
                new Item(104, "Laptop", "Electronics", 90000),
                new Item(105, "Jeans", "Clothing", 1800),
                new Item(106, "Furniture", "Home", 15000),
                new Item(106, "Furniture", "Home", 15000),
                new Item(106, "Furniture", "Home", 15000),
                new Item(106, "Furniture", "Home", 15000),
                new Item(106, "Furniture", "Home", 15000),
                new Item(106, "Furniture", "Home", 15000),
                new Item(106, "Furniture", "Home", 15000)
                
        );

        // Discount map: category → discount %
        Map<String, Double> discountMap = new HashMap<>();
        discountMap.put("Electronics", 10.0); // 10% off
        discountMap.put("Clothing", 20.0);    // 20% off

        // Apply discount to each item
        for (Item item : items) {
            item.applyDiscount(discountMap);
            System.out.println(item);
        }
    }
}
