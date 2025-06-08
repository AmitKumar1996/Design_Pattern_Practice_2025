package Deloitte;

import java.util.*;

public class InputOutput {

    // ✅ 1. Sum Output Example
    // Explanation:
    // "" is an empty string. Adding (a + b) to "" forces string concatenation.
    // So output becomes: "Sum: 15" not "Sum510"
    public static void sumExample() {
        int a = 5;
        int b = 10;
        System.out.println("Sum: " + a+b);  // Output: Sum:510
    }

    // ✅ 2. String Interning Example
    // Explanation:
    // 'a' is from string pool.
    // 'b' is a new object.
    // 'c' is interned, so it points to the same pool object as 'a'.
    public static void stringInterningExample() {
        System.out.println("String Interning Interview Examples:\n");

        // 🔹 Q1: What happens when you declare two strings with literals?
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1 == s2: " + (s1 == s2)); // true → same reference from string pool
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true → same content and same type 

        // 🔹 Q2: What happens when you use `new String()`?
        String s3 = new String("hello");
        System.out.println("s1 == s3: " + (s1 == s3)); // false → different objects
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true → same content

        // 🔹 Q3: Interning a new string object
        String s4 = s3.intern(); // returns reference from string pool
        System.out.println("s1 == s4: " + (s1 == s4)); // true
        System.out.println("s3 == s4: " + (s3 == s4)); // false

        // 🔹 Q4: Creating string with concat
        String s5 = "he" + "llo"; // compile-time evaluated, placed in pool
        System.out.println("s1 == s5: " + (s1 == s5)); // true

        // 🔹 Q5: Concat using variables
        String part1 = "he";
        String part2 = "llo";
        String s6 = part1 + part2; // runtime concatenation → heap object
        System.out.println("s1 == s6: " + (s1 == s6)); // false
        System.out.println("s1.equals(s6): " + s1.equals(s6)); // true

        // 🔹 Q6: Interning the runtime string
        String s7 = s6.intern();
        System.out.println("s1 == s7: " + (s1 == s7)); // true

        // 🔹 Q7: Null and equals check (safe handling)
        String s8 = null;
        // System.out.println(s8.equals("hello")); // ❌ NullPointerException
        System.out.println("Safe equals: " + "hello".equals(s8)); // false

        // 🔹 Q8: Case sensitivity
        String s9 = "Hello";
        System.out.println("s1.equals(s9): " + s1.equals(s9)); // false
        System.out.println("s1.equalsIgnoreCase(s9): " + s1.equalsIgnoreCase(s9)); // true
        
        StringBuffer sb1=new StringBuffer("hello");
        System.out.println("s1.equals(sb1)"+s1.equals(sb1.toString())); // because s1 is string and sb1 is object both have same value 
        System.out.println(sb1.toString());
        
        StringBuffer sbf1=new StringBuffer("hello");
        System.out.println("sb1.equals(sbf1)"+sb1.equals(sbf1));
        
    }


    // ✅ 3. List set() Example
    // Explanation:
    // Arrays.asList returns a fixed-size list.
    // set() works, but you can't add/remove elements.
    public static void listSetExample() {
        List<String> list = Arrays.asList("A", "B", "C");
        list.set(1, "Z");  // Replaces "B" with "Z"
        System.out.println(list);  // Output: [A, Z, C]
    }

    // ✅ 4. Employee equals() Example
    // Explanation:
    // equals() is overridden to compare empId.
    // e1 and e2 have same empId, so equals returns true.
    public static void employeeEqualsExample() {
        Employee e1 = new Employee();
        e1.setEmpId("1");
        e1.setName("E1");
        e1.setDepartment("d1");

        Employee e2 = new Employee();
        e2.setEmpId("1");
        e2.setName("E2");
        e2.setDepartment("d2");

        System.out.println(e1.equals(e2)); // Output: true (if comparing by empId)
    }

    // Main method to run examples
    public static void main(String[] args) {
        System.out.println("1. Sum Example:");
        sumExample();

        System.out.println("\n2. String Interning Example:");
        stringInterningExample();

        System.out.println("\n3. List Set Example:");
        listSetExample();

        System.out.println("\n4. Employee Equals Example:");
        employeeEqualsExample();
    }
}

// Supporting Employee class with overridden equals method
class Employee {
    private String empId;
    private String name;
    private String department;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;
        return Objects.equals(empId, other.empId);
    }

    // Setters
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
