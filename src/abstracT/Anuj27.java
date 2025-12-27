package abstracT;
abstract class Custom {

    String msg = "hello";
    static String txt = "hello there";
    static final public int NUM_VALUE = 100;

    abstract void greeting();

    void m1() {
        System.out.println("hi from m1()");
    }
}

class Demo extends Custom {
    void greeting() { }
}

interface Example {
    int x = 10;
    static int y = 19;

    void m2();

    default void m3() {
        System.out.println("Hi");
    }

    static void m4() {
        System.out.println("Hi");
    }
}

class Test implements Example {
    @Override
    public public void m2() { }
}

public class Anuj27 {
    public static void main(String[] args) {
    }
}
