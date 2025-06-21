package Deloitte;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TCS {

    public static void main(String[] args) {
        // Function 1: Convert UPPERCASE to Proper Case
        String s = "WHAT IS YOUR DATE OF BIRTH?";
        String[] formatted = convertLabel(s);
        System.out.println("Formatted:");
        for (String word : formatted) {
            System.out.print(word + " ");
        }
        System.out.println("\n");

        // Function 2: Sum of odd numbers using Stream API
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = sumOfOddNumbers(list);
        System.out.println("Sum of odd numbers: " + sum);

        // Function 3: Rotate Array
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int[] rotated = rotateArray(arr, k);
        System.out.print("Rotated array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }

    // ✅ Function 1: Convert all words to Proper Case (First letter capital, rest lowercase)
    public static String[] convertLabel(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                String firstChar = word.substring(0, 1).toUpperCase();
                String restChars = word.substring(1).toLowerCase();
                words[i] = firstChar + restChars;
            }
        }
        return words;
    }

    // ✅ Function 2: Sum of all odd numbers using Java Stream
    public static int sumOfOddNumbers(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // ✅ Function 3: Rotate Array to the right by k steps
    public static int[] rotateArray(int[] array, int k) {
        int n = array.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = array[i];
        }
        return result;
    }
}
