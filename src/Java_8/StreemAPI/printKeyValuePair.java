package Java_8.StreemAPI;

import java.util.HashMap;
import java.util.Map;

public class printKeyValuePair {

    public static void main(String[] args) {

        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 20);
        fruitMap.put("Orange", 15);

        System.out.println("=== Using for-each with Map.Entry ===");
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            System.out.println("-------------");
        }

        System.out.println("=== Using Java 8 forEach Lambda ===");
        fruitMap.forEach((key, value) -> {
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
            System.out.println("-------------");
        });
    }
}
