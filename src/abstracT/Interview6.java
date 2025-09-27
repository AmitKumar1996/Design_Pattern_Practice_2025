package abstracT;

import java.util.*;
import java.util.stream.Collectors;

public class Interview6 {

    // --------------- Sliding Window: Max Length of Subarray with Sum = K
    public static void main(String[] args) {
        int[] A = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int maxLen = 0;

        for (int start = 0; start < A.length; start++) {
            int sum = 0;
            for (int end = start; end < A.length; end++) {
                sum += A[end];
                if (sum == k) {
                    maxLen = Math.max(maxLen, end - start + 1);
                }
            }
        }

        System.out.println("Max Length of Subarray with sum " + k + ": " + maxLen);

        // --------------- Method Overloading Test
        OverloadTest test = new OverloadTest();
        test.display("Interview");   // Line A
        test.display(new Object());  // Line B
        test.display(null);          // Line C

        // --------------- Java 8 Streams: Group People by City
        List<Person> people = Arrays.asList(
            new Person("Alice", "New York"),
            new Person("Bob", "London"),
            new Person("Charlie", "New York"),
            new Person("David", "London"),
            new Person("Eve", "Paris")
        );

        Map<String, List<Person>> groupedByCity = people.stream()
            .collect(Collectors.groupingBy(Person::getCity));

        System.out.println("\nGrouped by City:");
        groupedByCity.forEach((city, group) -> {
            System.out.println(city + " -> " + group);
        });

        // --------------- SQL Equivalent for "Find employees with same salary"
        // SQL version (used in DB, not Java):
        // SELECT salary FROM SecondHighest GROUP BY salary HAVING COUNT(*) > 1;
    }

    // --------------- Overloading Class
    static class OverloadTest {
        void display(Object obj) {
            System.out.println("Object");
        }

        void display(String str) {
            System.out.println("String");
        }
    }

    // --------------- Person Class
    static class Person {
        private String name;
        private String city;

        public Person(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return name;
        }
        
        
        
        public class OverloadingTest {

            // Part 1: Method Overloading with sum(null)
            public static void sum(Boolean obj) {
                System.out.println("Boolean method");
            }

            public static void sum(Integer obj) {
                System.out.println("Integer method");
            }

            public static void sum(Object obj) {
                System.out.println("Object method");
            }

            // Uncomment this to resolve ambiguity
            // public static void sum(String str) {
            //     System.out.println("String method");
            // }

            public static void main(String[] args) {

                // ----- PART 1 -----
            	/*
            	What happens?
            			When you pass null to an overloaded method, the Java compiler tries to resolve the most specific method.

            			null can match all reference types (Boolean, Integer, Object).

            			But which one to call?

            			Ambiguity
            			Since both Boolean and Integer are equally specific (neither is a subclass of the other), the compiler will throw an error due to ambiguity
            	    ✅ Answer: Compilation error due to ambiguous method call
            	*/
            	
                // This line will cause compilation error due to ambiguity between Integer and Boolean
                // sum(null); 

                // ✅ To resolve the ambiguity, uncomment the sum(String str) method above.
                // Then, this call will print: "String method"

                // ----- PART 2 -----
            	
            	
            	
            	public class StringObjectCreation {
            	    public static void main(String[] args) {

            	        // Line 1: Creates 1 object in the String Pool (if not already present)
            	        String str1 = "Amit";  // 📌 1 object in String Pool

            	        // Line 2: Creates 1 new object in the Heap, reuses "Amit" from pool
            	        String str2 = new String("Amit");  // 📌 1 object in Heap

            	        // Line 3: Concatenates str1 + str2 → "AmitAmit"
            	        // Creates a new object in Heap for the result (not interned)
            	        String str3 = str1 + str2;  // 📌 1 object in Heap (concatenated string)
            	        
            	        // Optional: StringBuilder used internally (temporary object)
            	        // Total objects created: 
            	        // - 1 in String Pool ("Amit")
            	        // - 1 in Heap from new String(...)
            	        // - 1 in Heap from concatenation ("AmitAmit")
            	        // - (1 temporary StringBuilder object, optional based on compiler)
            	        
            	        System.out.println(str3);  // Output: AmitAmit
            	    }
            	}

            	
            	//-------------------Part-3----------------------------------------------------------------------------------
            	
            	
                // String str1 = "Amit"; // Commented out - does not execute, no object created

                String str2 = new String("Amit"); // (1)
                // "Amit" goes to string pool if not already present → 1 object in pool
                // new String(...) creates a new object in the heap → 1 object in heap

                // String str3 = str1 + str2; // ❌ This will not compile because str1 is commented out

                // ✅ Total objects: 2 (1 in string pool, 1 in heap)
            }
        }

    }
}
