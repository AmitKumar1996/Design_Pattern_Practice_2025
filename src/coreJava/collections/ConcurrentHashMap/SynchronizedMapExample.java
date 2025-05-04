package coreJava.collections.ConcurrentHashMap;

import java.util.*;
import java.util.concurrent.*;

public class SynchronizedMapExample {

    // Shared concurrent map
    private static Map<String, Integer> sharedMap = new ConcurrentHashMap<>();

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
                System.out.println("Reader thread reading: " + sharedMap);
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
     - ConcurrentHashMap is designed for high concurrency and allows thread-safe operations without locking the entire map.
     - Unlike synchronizedMap, it does not require external synchronization during iteration.
     - It divides the map into segments, enabling concurrent access to different segments, improving performance.

     ✅ Highlights:
     - No need to use synchronized blocks with ConcurrentHashMap.
     - Thread-safe for put(), get(), remove(), and iteration.
     - Suitable for use cases with frequent reads and writes from multiple threads.
    */
} 
