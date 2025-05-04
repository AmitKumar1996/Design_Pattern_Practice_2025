package coreJava.collections.SynchronizedMap;

import java.util.*;

public class SynchronizedMapExample {

    // Shared synchronized map
    private static Map<String, Integer> sharedMap = Collections.synchronizedMap(new HashMap<>());

    public static void main(String[] args) {

        // Create multiple threads that modify the shared map
        Thread writer1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedMap.put("Writer1-" + i, i);
                System.out.println("Writer1 added: " + "Writer1-" + i);
                sleep(100);
            }
        });

        Thread writer2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedMap.put("Writer2-" + i, i * 10);
                System.out.println("Writer2 added: " + "Writer2-" + i);
                sleep(100);
            }
        });

        Thread reader = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (sharedMap) {
                    System.out.println("Reader thread reading: " + sharedMap);
                }
                sleep(150);
            }
        });

        // Start threads
        writer1.start();
        writer2.start();
        reader.start();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /*
     🧠 Key Points:
     - Collections.synchronizedMap() makes the map thread-safe for basic operations like put() and get().
     - Iteration still needs explicit synchronization: that's why the reader thread uses synchronized(sharedMap)
       during reading to avoid ConcurrentModificationException.
    */
} 
