package Static;

public class Outer {
    public static class Counter {
        static int count = 0;

        public void increment() {
            count++;
            System.out.println("Count: " + count);
        }
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.increment();  // Count: 1

        Counter c2 = new Counter();
        c2.increment();  // Count: 2 (shared static variable)
    }
}




/*
 ✅ Advantages of Static Nested Class
Does Not Require Outer Class Instance

You can create an object of the nested class without creating an object of the outer class.

Example:

Outer.Counter c = new Outer.Counter(); // No need for 'new Outer()'
Better Encapsulation

Keeps the related classes grouped logically.

Good when the nested class is only used within the outer class context.

Access to Static Members Only

A static nested class cannot access non-static members of the outer class directly. This enforces clear separation of concerns and avoids tight coupling.

Memory Efficient

Since it doesn’t carry a reference to the outer class, it uses slightly less memory than a non-static inner class.

Organizational Clarity

Makes it easier to logically structure utility/helper classes within a class when they don't need to access instance data of the outer class.
 */