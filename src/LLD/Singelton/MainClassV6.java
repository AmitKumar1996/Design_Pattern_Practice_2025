package LLD.Singelton;

class DbConnection {
    // Step 1: create a private static instance
    private static MainClassV6 ins;

    // Step 2: private constructor
    private DbConnection() {
        System.out.println("MainClassV6 object created...");
    }

    // Step 3: public static method to return instance
    public static MainClassV6 getInstance() {
        if (ins == null) { // race condition ⚠️
            ins = new MainClassV6();
        }
        return ins;
    }
}

// -----------------------------------

class Adder implements Runnable {
    @Override
    public void run() {
        MainClassV6 db1 = DbConnection.getInstance();
        System.out.println("Adder Thread got instance: " + db1.hashCode());
    }
}

class Sub implements Runnable {
    @Override
    public void run() {
        MainClassV6 db2 = DbConnection.getInstance();
        System.out.println("Sub Thread got instance: " + db2.hashCode());
    }
}

// -----------------------------------

public class MainClassV6 {
    public static void main(String[] args) {
        Adder a = new Adder();
        Sub s = new Sub();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }
}
