package Static;

public class Example {

    // Static variable (class variable)
    static int count = 0;  // Shared by all instances

    // Constructor
    public Example() {
        count++;  // Incremented every time an object is created
    }

    // Static method
    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    // Instance method (non-static)
    public void showMessage() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Calling static method without creating an instance
        Example.displayCount();  // Output: Total objects created: 0

        // Creating objects
        Example obj1 = new Example();
        Example obj2 = new Example();

        // Calling static method again
        Example.displayCount();  // Output: Total objects created: 2

        // Calling instance method using object reference
        obj1.showMessage();  // Output: This is an instance method.
    }
}
