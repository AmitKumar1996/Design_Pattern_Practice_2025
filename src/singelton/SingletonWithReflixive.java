package singelton;

public class SingletonWithReflixive {

    // Eager initialization of instance
    private static final SingletonWithReflixive instance = new SingletonWithReflixive();

    // Flag to prevent reflection-based creation
    private static boolean instanceCreated = false;

    // Private constructor
    private SingletonWithReflixive() {
        // Prevent instantiation via reflection
        if (instanceCreated) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        instanceCreated = true;
    }

    // Public method to return the same instance (synchronized not required for eager initialization)
    public static SingletonWithReflixive getInstance() {
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

