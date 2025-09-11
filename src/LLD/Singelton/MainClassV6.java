package LLD.Singelton;

// ---------------------------
// Singleton Class
// ---------------------------
class DbConnection {
    // Step 1: create a private static instance
    private static DbConnection ins;

    // Step 2: private constructor
    private DbConnection() {
        System.out.println("DbConnection object created... " + this.hashCode());
    }
   // CHANDAN@0001
    // Step 3: public static method to return instance
    public static DbConnection getInstance() {
        if (ins == null) { // race condition ⚠️
            ins = new DbConnection();
        }
        return ins;
    }
}

// ---------------------------
// Worker Threads
// ---------------------------
class Adder implements Runnable {
    @Override
    public void run() {
        DbConnection db1 = DbConnection.getInstance();
        System.out.println(Thread.currentThread().getName() + " (Adder) got instance: " + db1.hashCode());
    }
}

class Sub implements Runnable {
    @Override
    public void run() {
        DbConnection db2 = DbConnection.getInstance();
        System.out.println(Thread.currentThread().getName() + " (Sub) got instance: " + db2.hashCode());
    }
}

// ---------------------------
// Main Class
// ---------------------------
public class MainClassV6 {
    public static void main(String[] args) {
        Adder a = new Adder();
        Sub s = new Sub();

        // Creating 15 threads explicitly
        Thread t1 = new Thread(a, "Thread-1");
        Thread t2 = new Thread(s, "Thread-2");
        Thread t3 = new Thread(a, "Thread-3");
        Thread t4 = new Thread(s, "Thread-4");
        Thread t5 = new Thread(a, "Thread-5");
        Thread t6 = new Thread(s, "Thread-6");
        Thread t7 = new Thread(a, "Thread-7");
        Thread t8 = new Thread(s, "Thread-8");
        Thread t9 = new Thread(a, "Thread-9");
        Thread t10 = new Thread(s, "Thread-10");
        Thread t11 = new Thread(a, "Thread-11");
        Thread t12 = new Thread(s, "Thread-12");
        Thread t13 = new Thread(a, "Thread-13");
        Thread t14 = new Thread(s, "Thread-14");
        Thread t15 = new Thread(a, "Thread-15");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
    }
}
