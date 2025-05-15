package abstracT.Example_1;

import java.util.*;
import java.util.stream.Collectors;

// Base Product class
abstract class Product {
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "[" + category + "] " + name;
    }
}

// Subclasses for each product type
class Book extends Product {
    public Book(String name) {
        super(name, "Book");
    }
}

class Computer extends Product {
    public Computer(String name) {
        super(name, "Computer");
    }
}

class iPad extends Product {
    public iPad(String name) {
        super(name, "iPad");
    }
}

// Factory pattern to create products
class ProductFactory {
    public static Product createProduct(String type, String name) {
        return switch (type) {
            case "Book" -> new Book(name);
            case "Computer" -> new Computer(name);
            case "iPad" -> new iPad(name);
            default -> throw new IllegalArgumentException("Unknown product type");
        };
    }
}

// Inventory class that uses composition to hold products
class Inventory {
    private final List<Product> products = new ArrayList<>();

    // Populate with 100 mixed products
    public void initializeProducts() {
        String[] types = {"Book", "Computer", "iPad"};
        Random random = new Random();

        for (int i = 1; i <= 100; i++) {
            String type = types[random.nextInt(types.length)];
            products.add(ProductFactory.createProduct(type, type + " " + i));
        }
    }

    // Sort products by category in descending order using Streams
    public List<Product> getSortedProductsByCategoryDesc() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCategory).reversed())
                .collect(Collectors.toList());
    }

    public void displayProducts(List<Product> productList) {
        productList.forEach(System.out::println);
    }
}

// Main class to run the demo
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.initializeProducts();

        System.out.println("=== Sorted Products by Category (Descending) ===");
        List<Product> sortedProducts = inventory.getSortedProductsByCategoryDesc();
        inventory.displayProducts(sortedProducts);
    }
}
