package Static;

public class Counter {

    // Static variable
    static int totalObjects = 0;

    // Instance variable
    int objectId;

    // Constructor
    public Counter() {
        totalObjects++;  // Static variable modified every time a new object is created
        objectId = totalObjects;
    }

    // Static method to display the total count of objects created
    public static void displayTotal() {
        System.out.println("Total objects created: " + totalObjects);
    }

    // Instance method to display object ID
    public void displayObjectId() {
        System.out.println("Object ID: " + objectId);
    }

    public static void main(String[] args) {
        Counter.displayTotal();  // Output: Total objects created: 0

        // Creating objects
        Counter obj1 = new Counter();  // Object 1
        Counter obj2 = new Counter();  // Object 2

        // Calling static method
        Counter.displayTotal();  // Output: Total objects created: 2

        // Calling instance method
        obj1.displayObjectId();  // Output: Object ID: 1
        obj2.displayObjectId();  // Output: Object ID: 2
    }
}
