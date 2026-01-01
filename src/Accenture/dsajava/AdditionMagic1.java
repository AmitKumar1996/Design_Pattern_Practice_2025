package Accenture.dsajava;

import java.util.Scanner;

class additionMagic {

    // double + String
    public String add(double a, String b) {
        if (a == (long) a) {
            return String.valueOf((long) a) + b;
        }
        return String.valueOf(a) + b;
    }

    // double + double
    public String add(double a, double b) {
        double sum = a + b;
        return String.format("%.2f", sum);
    }

    // String + String
    public String add(String a, String b) {
        return a + b;
    }
}

public class AdditionMagic1 {

    public static void main(String[] args) {

        additionMagic additionMagic = new additionMagic();

        // Test case 1: double + double
        System.out.println(additionMagic.add(1, 2));        // 3.00
        System.out.println(additionMagic.add(3, 4));        // 7.00

        // Test case 2: double + String
        System.out.println(additionMagic.add(1, "hello"));  // 1hello
        System.out.println(additionMagic.add(2.5, "kg"));   // 2.5kg

        // Test case 3: String + String
        System.out.println(additionMagic.add("hello,", "world")); // hello,world
    }
}
