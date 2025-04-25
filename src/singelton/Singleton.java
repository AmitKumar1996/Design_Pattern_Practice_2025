package singelton;

public class Singleton {
    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Make constructor private
    private Singleton() {}

    // Step 3: Provide a public method to get the instance with synchronization for thread-safety
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // lazy initialization
        }
        return instance;
    }

    // Method to display a message
    public void showMessage() {
        System.out.println(Thread.currentThread().getName() + " says: Hello from Singleton!");
    }

    // Main method to test Singleton with threads
    public static void main(String[] args) {
        // Creating 5 threads that will attempt to access the Singleton instance
        Runnable task = new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                singleton.showMessage();
            }
        };

        // Create multiple threads to simulate concurrent access to the Singleton
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");
        Thread thread4 = new Thread(task, "Thread-4");
        Thread thread5 = new Thread(task, "Thread-5");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            // Wait for all threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the same instance is shared across all threads
        System.out.println("Singleton instance is shared across threads: " + (Singleton.getInstance() == Singleton.getInstance()));
    }
}
