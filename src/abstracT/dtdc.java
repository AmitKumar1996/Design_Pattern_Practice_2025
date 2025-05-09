package abstracT;

import java.util.HashMap;
import java.util.Map;

public class HashMapScenarios {

    public static void main(String[] args) {

        System.out.println("===== Scenario 1: Duplicate Keys =====");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Amit");
        map1.put(1, "Kumar"); // overwrites previous value
        System.out.println("map1: " + map1); // Output: {1=Kumar}
        // Q: What happens when you put the same key again? → Value is overwritten.

        System.out.println("\n===== Scenario 2: Different Keys, Same Values =====");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Amit");
        map2.put(2, "Amit");
        System.out.println("map2: " + map2); // Output: {1=Amit, 2=Amit}
        // Q: Can a HashMap have duplicate values? → Yes.

        System.out.println("\n===== Scenario 3: Null Key Handling =====");
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(null, "First");
        map3.put(null, "Second"); // overwrites
        System.out.println("map3: " + map3); // Output: {null=Second}
        // Q: How many null keys are allowed? → Only one.

        System.out.println("\n===== Scenario 4: Iterating HashMap =====");
        Map<Integer, String> map4 = new HashMap<>();
        map4.put(1, "One");
        map4.put(2, "Two");
        for (Map.Entry<Integer, String> entry : map4.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Q: How to loop through HashMap? → Using entrySet.

        System.out.println("\n===== Scenario 5: containsKey and containsValue =====");
        Map<Integer, String> map5 = new HashMap<>();
        map5.put(1, "Hello");
        System.out.println("Contains key 1: " + map5.containsKey(1)); // true
        System.out.println("Contains value 'Hello': " + map5.containsValue("Hello")); // true
        // Q: How to check existence of a key or value?

        System.out.println("\n===== Scenario 6: replace() =====");
        Map<Integer, String> map6 = new HashMap<>();
        map6.put(1, "Old");
        map6.replace(1, "Old", "New"); // only replaces if current value matches
        System.out.println("map6: " + map6); // Output: {1=New}
        // Q: What happens if the current value doesn't match? → No change.

        System.out.println("\n===== Scenario 7: merge() =====");
        Map<Integer, String> map7 = new HashMap<>();
        map7.put(1, "Amit");
        map7.merge(1, " Kumar", (oldVal, newVal) -> oldVal + newVal);
        System.out.println("map7: " + map7); // Output: {1=Amit Kumar}
        // Q: What is merge used for? → Conditional updates or appends.

    }
}
