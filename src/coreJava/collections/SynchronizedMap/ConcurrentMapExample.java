package coreJava.collections.SynchronizedMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentMapExample {

    private static Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        // Writer thread 1
        Thread writer1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentMap.put("W1-Key" + i, i);
                System.out.println("Writer1 put: W1-Key" + i);
                sleep(100);
            }
        });

        // Writer thread 2
        Thread writer2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                concurrentMap.put("W2-Key" + i, i * 10);
                System.out.println("Writer2 put: W2-Key" + i);
                sleep(100);
            }
        });

        // Reader thread
        Thread reader = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Reader sees map: " + concurrentMap);
                sleep(150);
            }
        });

        // Start all threads
        writer1.start();
        writer2.start();
        reader.start();
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
