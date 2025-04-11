package string;

public class StringEqualityDemo {

    public static void main(String[] args) {
        // Scenario 1: String literals (string pool)
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("Scenario 1 - Literal comparison:");
        System.out.println("s1 == s2: " + (s1 == s2));          // true (same object in pool)
        System.out.println("s1.equals(s2): " + s1.equals(s2));  // true
        
        // Scenario 2: new String() creates new object
        String s3 = new String("hello");
        System.out.println("\nScenario 2 - New String object:");
        System.out.println("s1 == s3: " + (s1 == s3));          // false (different objects)
        System.out.println("s1.equals(s3): " + s1.equals(s3));  // true
        
        // Scenario 3: String interning
        String s4 = s3.intern();
        System.out.println("\nScenario 3 - String interning:");
        System.out.println("s1 == s4: " + (s1 == s4));          // true (now in pool)
        
        // Scenario 4: Compile-time concatenation
        String s5 = "hel" + "lo";
        System.out.println("\nScenario 4 - Compile-time concatenation:");
        System.out.println("s1 == s5: " + (s1 == s5));          // true (compile-time optimization)
        
        // Scenario 5: Runtime concatenation
        String s6 = "hel";
        String s7 = s6 + "lo";
        System.out.println("\nScenario 5 - Runtime concatenation:");
        System.out.println("s1 == s7: " + (s1 == s7));          // false (new object created)
        System.out.println("s1.equals(s7): " + s1.equals(s7));  // true
        
        // Scenario 6: null comparison
        String s8 = null;
        System.out.println("\nScenario 6 - Null comparison:");
        try {
            System.out.println("s8.equals(s1)"); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("s8.equals(s1) throws NullPointerException");
        }
        
        // Safe null comparison
        System.out.println("Safe comparison:");
        System.out.println("Objects.equals(s8, s1): " + java.util.Objects.equals(s8, s1));
        
        // Scenario 7: Case sensitivity
        String s9 = "HELLO";
        System.out.println("\nScenario 7 - Case sensitivity:");
        System.out.println("s1.equals(s9): " + s1.equals(s9));          // false
        System.out.println("s1.equalsIgnoreCase(s9): " + s1.equalsIgnoreCase(s9)); // true
        
        // Scenario 8: StringBuilder comparison
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("\nScenario 8 - StringBuilder comparison:");
        System.out.println("s1.equals(sb): " + s1.equals(sb));  // false (different types)
        System.out.println("s1.contentEquals(sb): " + s1.contentEquals(sb)); // true
    }
}