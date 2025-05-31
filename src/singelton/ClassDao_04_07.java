package singelton;

public class ClassDao_04_07 {

    // Volatile ensures visibility in multi-threaded environments
    private static volatile ClassDao_04_07 instance = null;

    // Private constructor prevents external instantiation
    private ClassDao_04_07() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance");
        }
    }

    // Global access method
    public static ClassDao_04_07 getInstance() {
        if (instance == null) {
            synchronized (ClassDao_04_07.class) {
                if (instance == null) {
                    instance = new ClassDao_04_07();
                }
            }
        }
        return instance;
    }

    public void show() {
        System.out.println("Hello from Singleton. HashCode: " + this.hashCode());
    }

    public static void main(String[] args) {
        ClassDao_04_07 obj1 = ClassDao_04_07.getInstance();
        obj1.show();

        ClassDao_04_07 obj2 = ClassDao_04_07.getInstance();
        obj2.show();
    }
}
