package Java_8.StreemAPI;

import java.util.*;
import java.util.stream.*;

class StreamAPIExamples {
    public static void main(String[] args) {
        // Sample data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Employee> employees = List.of(
                new Employee("John", true, 50000), new Employee("Jane", false, 60000), new Employee("Mike", true, 70000)
        );
        List<Customer> customers = List.of(
                new Customer("Alice", 500), new Customer("Bob", 1500), new Customer("Charlie", 800)
        );
        List<Student> students = List.of(
                new Student("Alex", 3.6, 4), new Student("Brian", 3.2, 2), new Student("Chris", 3.9, 5)
        );
        
        // 1. Filtering even numbers
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
        
        // 2. Extracting active employees
        List<Employee> activeEmployees = employees.stream().filter(Employee::isActive).collect(Collectors.toList());
        System.out.println("Active Employees: " + activeEmployees);
        
        // 3. Filtering customers with orders above a certain amount
        List<Customer> highValueCustomers = customers.stream().filter(c -> c.getOrderAmount() > 1000).collect(Collectors.toList());
        System.out.println("High-Value Customers: " + highValueCustomers);
        
        // 4. Getting students with GPA above 3.5
        List<Student> topStudents = students.stream().filter(s -> s.getGpa() > 3.5).collect(Collectors.toList());
        System.out.println("Top Students: " + topStudents);
        
        // 5. Filtering invalid email addresses
        List<String> emails = Arrays.asList("valid@example.com", "invalid.com", "user@domain");
        List<String> validEmails = emails.stream().filter(email -> email.contains("@") && email.contains(".")).collect(Collectors.toList());
        System.out.println("Valid Emails: " + validEmails);
        
        // 6. Removing duplicate phone numbers
        List<String> phoneNumbers = Arrays.asList("12345", "67890", "12345", "98765");
        List<String> uniquePhones = phoneNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Phone Numbers: " + uniquePhones);
        
        // 7. Extracting all managers from employee list
        List<Employee> managers = employees.stream().filter(emp -> emp.getSalary() > 60000).collect(Collectors.toList());
        System.out.println("Managers: " + managers);
        
        // 8. Filtering expired products from an inventory
        List<Product> products = List.of(new Product("Laptop", true), new Product("Phone", false));
        List<Product> availableProducts = products.stream().filter(Product::isAvailable).collect(Collectors.toList());
        System.out.println("Available Products: " + availableProducts);
        
        // Add more filtering, sorting, aggregation, and transformation examples here...
    }
}

class Employee {
    private String name;
    private boolean active;
    private double salary;
    
    public Employee(String name, boolean active, double salary) {
        this.name = name;
        this.active = active;
        this.salary = salary;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

class Customer {
    private String name;
    private double orderAmount;
    
    public Customer(String name, double orderAmount) {
        this.name = name;
        this.orderAmount = orderAmount;
    }
    
    public double getOrderAmount() {
        return orderAmount;
    }
    
    @Override
    public String toString() {
        return name + " ($" + orderAmount + ")";
    }
}

class Student {
    private String name;
    private double gpa;
    private int pendingAssignments;
    
    public Student(String name, double gpa, int pendingAssignments) {
        this.name = name;
        this.gpa = gpa;
        this.pendingAssignments = pendingAssignments;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public int getPendingAssignments() {
        return pendingAssignments;
    }
    
    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

class Product {
    private String name;
    private boolean available;
    
    public Product(String name, boolean available) {
        this.name = name;
        this.available = available;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
