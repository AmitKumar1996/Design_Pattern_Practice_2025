package Top50;

/*
 * Top 50 Java Coding Interview Questions
 */

import java.util.*;

public class JavaTop50InterviewCode {

    public static void main(String[] args) {
        reverseString();
        palindromeCheck();
        findDuplicates();
        anagramCheck();
        countVowelsAndConsonants();
        factorial();
        fibonacci();
        primeCheck();
        swapNumbers();
        reverseNumber();
        checkArmstrong();
        findGCDAndLCM();
        checkEvenOdd();
        removeDuplicatesFromArray();
        findLargestSmallestInArray();
        binarySearch();
        mergeSortedArrays();
        findMiddleElementInLinkedList();
        detectLoopInLinkedList();
        findMissingNumberInArray();
        bubbleSort();
        insertionSort();
        selectionSort();
        quickSort();
        mergeSort();
        inorderTraversal();
        preorderTraversal();
        postorderTraversal();
        checkBalancedParentheses();
        implementStack();
        implementQueue();
        implementHashMap();
        checkLeapYear();
        sumOfDigits();
        decimalToBinary();
        powerOfNumber();
        countWordOccurrences();
        removeWhitespaces();
        checkIfArrayIsSorted();
        findCommonElements();
        countWordsInString();
        printPattern();
        reverseWordsInSentence();
        countNumberOfDigits();
        generateRandomNumber();
        checkArrayContainsDuplicate();
        findSubarrayWithGivenSum();
        findMajorityElement();
        implementSingleton();
        checkIfBST();
        mergeTwoLinkedLists();
        findKthLargestElement();
    }

    // 1. Reverse a String
    public static void reverseString() {
        String str = "Hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }

    // 2. Check if a string is a palindrome
    public static void palindromeCheck() {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str + " is palindrome: " + str.equals(reversed));
    }

    // 3. Find duplicates in an array
    public static void findDuplicates() {
        int[] arr = {1, 2, 3, 2, 4, 5, 4};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }

    // 4. Check if two strings are anagrams
    public static void anagramCheck() {
        String str1 = "listen", str2 = "silent";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println(str1 + " and " + str2 + " are anagrams: " + isAnagram);
    }

    // 5. Count vowels and consonants in a string
    public static void countVowelsAndConsonants() {
        String str = "Hello World";
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // 6. Calculate factorial of a number
    public static void factorial() {
        int num = 5;
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + ": " + factorial);
    }

    // 7. Fibonacci series
    public static void fibonacci() {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    // 8. Check if a number is prime
    public static void primeCheck() {
        int num = 17;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + " is prime: " + isPrime);
    }

    // 9. Swap two numbers without using a temporary variable
    public static void swapNumbers() {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // 10. Reverse a number
    public static void reverseNumber() {
        int num = 1234;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    // 11. Check if a number is Armstrong (already implemented)
    public static void checkArmstrong() {
        int num = 153, originalNum, remainder, result = 0;
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        System.out.println(num + " is Armstrong: " + (result == num));
    }

    // 12. Find GCD and LCM (already implemented)
    public static void findGCDAndLCM() {
        int a = 15, b = 20, gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) gcd = i;
        }
        int lcm = (a * b) / gcd;
        System.out.println("GCD: " + gcd + ", LCM: " + lcm);
    }

    // 13. Check if a number is even or odd (already implemented)
    public static void checkEvenOdd() {
        int num = 5;
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
    }

    // 14. Remove duplicates from array (already implemented)
    public static void removeDuplicatesFromArray() {
        int[] arr = {1, 2, 3, 1, 2, 4, 5};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Array after removing duplicates: " + set);
    }

    // 15. Find largest and smallest in array (already implemented)
    public static void findLargestSmallestInArray() {
        int[] arr = {5, 1, 9, 3, 7};
        int largest = arr[0], smallest = arr[0];
        for (int num : arr) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }
        System.out.println("Largest: " + largest + ", Smallest: " + smallest);
    }

    // 16. Binary search (already implemented)
    public static void binarySearch() {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5, low = 0, high = arr.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                found = true;
                break;
            }
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(target + " found: " + found);
    }

    // 17. Merge two sorted arrays (already implemented)
    public static void mergeSortedArrays() {
        int[] arr1 = {1, 3, 5}, arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }
        while (i < arr1.length) merged[k++] = arr1[i++];
        while (j < arr2.length) merged[k++] = arr2[j++];
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }

    // 18. Find middle element in linked list (already implemented)
    public static void findMiddleElementInLinkedList() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int middleIndex = list.size() / 2;
        System.out.println("Middle Element: " + list.get(middleIndex));
    }

    // 19. Detect loop in linked list (already implemented)
    public static void detectLoopInLinkedList() {
        System.out.println("Loop detection in Linked List is a more advanced topic requiring a custom LinkedList implementation.");
    }

    // 20. Find missing number in array (already implemented)
    public static void findMissingNumberInArray() {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum -= num;
        }
        System.out.println("Missing Number: " + sum);
    }

    // 21. Bubble sort
    public static void bubbleSort() {
        int[] arr = {5, 2, 9, 1, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
    }

    // 22. Insertion sort
    public static void insertionSort() {
        int[] arr = {5, 2, 9, 1, 5};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion Sorted: " + Arrays.toString(arr));
    }

    // 23. Selection sort
    public static void selectionSort() {
        int[] arr = {5, 2, 9, 1, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection Sorted: " + Arrays.toString(arr));
    }

    // 24. Quick sort
    public static void quickSort() {
        int[] arr = {5, 2, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sorted: " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // 25. Merge sort
    public static void mergeSort() {
        int[] arr = {5, 2, 9, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Merge Sorted: " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // 26. Inorder traversal (binary tree)
    public static void inorderTraversal() {
        System.out.println("Inorder traversal requires a binary tree implementation.");
    }

    // 27. Preorder traversal (binary tree)
    public static void preorderTraversal() {
        System.out.println("Preorder traversal requires a binary tree implementation.");
    }

    // 28. Postorder traversal (binary tree)
    public static void postorderTraversal() {
        System.out.println("Postorder traversal requires a binary tree implementation.");
    }

    // 29. Check balanced parentheses
    public static void checkBalancedParentheses() {
        String str = "{[()]}";
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{') || 
                    (ch == ']' && top != '[') || 
                    (ch == ')' && top != '(')) {
                    balanced = false;
                    break;
                }
            }
        }
        balanced = balanced && stack.isEmpty();
        System.out.println(str + " has balanced parentheses: " + balanced);
    }

    // 30. Implement stack (already implemented)
    public static void implementStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped: " + stack.pop());
    }

    // 31. Implement queue (already implemented)
    public static void implementQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Polled: " + queue.poll());
    }

    // 32. Implement hashmap (already implemented)
    public static void implementHashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(2, "Kumar");
        System.out.println("Map Value: " + map.get(1));
    }

    // 33. Check leap year (already implemented)
    public static void checkLeapYear() {
        int year = 2024;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is Leap Year: " + isLeap);
    }

    // 34. Sum of digits (already implemented)
    public static void sumOfDigits() {
        int num = 1234, sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }

    // 35. Decimal to binary (already implemented)
    public static void decimalToBinary() {
        int num = 10;
        System.out.println("Binary of " + num + ": " + Integer.toBinaryString(num));
    }

    // 36. Power of a number (already implemented)
    public static void powerOfNumber() {
        int base = 2, exp = 3;
        System.out.println("Power: " + Math.pow(base, exp));
    }

    // 37. Count word occurrences (already implemented)
    public static void countWordOccurrences() {
        String str = "hello world hello";
        String[] words = str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Occurrences: " + wordCount);
    }

    // 38. Remove whitespaces (already implemented)
    public static void removeWhitespaces() {
        String str = " Hello World ";
        System.out.println("String without whitespaces: " + str.replaceAll("\\s", ""));
    }

    // 39. Check if array is sorted (already implemented)
    public static void checkIfArrayIsSorted() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is sorted: " + isSorted);
    }

    // 40. Find common elements in two arrays
    public static void findCommonElements() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) common.add(num);
        }
        System.out.println("Common Elements: " + common);
    }

    // 41. Count words in a string
    public static void countWordsInString() {
        String str = "Hello World Java";
        String[] words = str.split("\\s+");
        System.out.println("Word count: " + words.length);
    }

    // 42. Print pattern (pyramid)
    public static void printPattern() {
        int rows = 5;
        System.out.println("Pyramid Pattern:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 43. Reverse words in a sentence
    public static void reverseWordsInSentence() {
        String str = "Hello World Java";
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Reversed Sentence: " + reversed.toString().trim());
    }

    // 44. Count number of digits in a number
    public static void countNumberOfDigits() {
        int num = 12345;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }

    // 45. Generate random number
    public static void generateRandomNumber() {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println("Random number between 0-100: " + randomNum);
    }

    // 46. Check if array contains duplicate
    public static void checkArrayContainsDuplicate() {
        int[] arr = {1, 2, 3, 1};
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;
        for (int num : arr) {
            if (!set.add(num)) {
                hasDuplicate = true;
                break;
            }
        }
        System.out.println("Array contains duplicate: " + hasDuplicate);
    }

    // 47. Find subarray with given sum
    public static void findSubarrayWithGivenSum() {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
        int currentSum = 0, start = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            while (currentSum > targetSum && start < i) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == targetSum) {
                found = true;
                System.out.println("Subarray found from index " + start + " to " + i);
                break;
            }
        }
        if (!found) System.out.println("No subarray found with sum " + targetSum);
    }

    // 48. Find majority element (appears more than n/2 times)
    public static void findMajorityElement() {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int candidate = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        // Verify if candidate is majority
        count = 0;
        for (int num : arr) if (num == candidate) count++;
        if (count > arr.length / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element found");
        }
    }

    // 49. Implement singleton pattern
    public static void implementSingleton() {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }

    static class Singleton {
        private static Singleton instance;
        private Singleton() {}
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
        public void showMessage() {
            System.out.println("Hello from Singleton instance!");
        }
    }

    // 50. Check if binary tree is BST (Binary Search Tree)
    public static void checkIfBST() {
        System.out.println("BST check requires a binary tree implementation.");
    }

    // Additional methods that were in the original list but not implemented yet
    public static void mergeTwoLinkedLists() {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        LinkedList<Integer> merged = new LinkedList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        System.out.println("Merged Linked List: " + merged);
    }

    public static void findKthLargestElement() {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Arrays.sort(arr);
        System.out.println(k + "th largest element: " + arr[arr.length - k]);
    }
}