package Java_8;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

//        // -------------------------
//        // 1. Using entrySet()
//        // -------------------------
//        // Best when you want to access both key and value
//        System.out.println("Using entrySet():");
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
//
//        // -------------------------
//        // 2. Using keySet()
//        // -------------------------
//        // Best when you only need keys
//        System.out.println("\nUsing keySet():");
//        for (String key : map.keySet()) {
//            System.out.println("Key: " + key);
//        }
//
//        // -------------------------
//        // 3. Using values()
//        // -------------------------
//        // Best when you only need values
//        System.out.println("\nUsing values():");
//        for (Integer value : map.values()) {
//            System.out.println("Value: " + value);
//        }
    
    
      for(Map.Entry<String, Integer> i:map.entrySet()) {
    	  
    	  System.out.println(i);
    	  
      }
      
      for(String i: map.keySet()) {
    	  System.out.println(i);
      }
      
      for(Integer i:map.values()) {
    	  System.out.println(i);
      }
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}

