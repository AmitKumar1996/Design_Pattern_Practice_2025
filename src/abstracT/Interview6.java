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
        // SELECT salary FROM Employee GROUP BY salary HAVING COUNT(*) > 1;
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
    }
}
