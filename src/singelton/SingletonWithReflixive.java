package singelton;

// Thread-safe and Reflection-safe Singleton Pattern

public class SingletonWithReflixive {

    // Eager initialization
    private static final SingletonWithReflixive instance = new SingletonWithReflixive();

    // Flag to detect second instantiation
    private static boolean instanceCreated = false;

    // Private constructor
    private SingletonWithReflixive() {
        if (instanceCreated) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        instanceCreated = true;
    }

    // Public method to provide access to the instance
    public static SingletonWithReflixive getInstance() {
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    // Test class to demonstrate singleton
    public static void main(String[] args) {
        SingletonWithReflixive s1 = SingletonWithReflixive.getInstance();
        s1.showMessage();

        // Uncommenting below code will throw exception due to reflection
        /*
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton s2 = constructor.newInstance();
            s2.showMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
