package Java_8;



import java.util.ArrayList;

public class evenNumber {

    public static void main(String[] args) {

        // Find the number of occurrences of 'P' in the list using Java 8
        ArrayList<String> l = new ArrayList<>();

        l.add("AAP");
        l.add("BJP");
        l.add("CONG");
        l.add("JDU");
        l.add("SP");

        // Count occurrences of 'P' in all strings
        long num = l.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c)) // Convert each string to characters
                .filter(c -> c == 'P')                          // Filter for 'P'
                .count();

        System.out.println("Number of occurrences of 'P' in the list: " + num);

        // Sum of even numbers in a string
        String str = "12345678";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';  // Corrected to subtract '0' for numeric value

            if (n % 2 == 0) {
                sum = sum + n;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
