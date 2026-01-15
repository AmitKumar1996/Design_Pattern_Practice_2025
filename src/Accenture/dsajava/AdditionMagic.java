package Accenture.dsajava;

public class AdditionMagic {

    // double + double
    public String add(double a, double b) {
        double sum = a + b;

        // If whole number → one decimal
        if (sum == Math.floor(sum)) {
            return String.format("%.1f", sum);
        }

        // Otherwise → rounded to 2 decimals
        return String.format("%.2f", sum);
    }
    // double + String
    public String add(double a, String b) {
        if (a == Math.floor(a)) {
            return String.format("%.0f", a) + b;
        }
        return a + b;
    }
    // String + String
    public String add(String a, String b) {
        return a + b;
    }
    // 🔹 Main method (for testing)
    public static void main(String[] args) {
        AdditionMagic am = new AdditionMagic();

        System.out.println(am.add(10.0, 20.0));    // 30.0
        System.out.println(am.add(10.25, 20.12));  // 30.37
        System.out.println(am.add(10.0, "ABC"));   // 10ABC
        System.out.println(am.add(10.5, "XYZ"));   // 10.5XYZ
        System.out.println(am.add("Hello", "World")); // HelloWorld
    }
}
