package abstracT;

import java.util.*;
import java.util.stream.Collectors;

class Employees {
    String name;
    String department;
    int salary;

    public Employees(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class singeltonPWC {

    // --- Singleton Pattern ---
    private static singeltonPWC singeltonpwc = null;

    private singeltonPWC() {
    }

    private static synchronized singeltonPWC getInstance() {
        if (singeltonpwc == null) {
            singeltonpwc = new singeltonPWC();
        }
        return singeltonpwc;
    }

    public static void main(String[] args) {

        // --- Singleton Test ---
        singeltonPWC obj1 = singeltonPWC.getInstance();
        singeltonPWC obj2 = singeltonPWC.getInstance();
        System.out.println("Singleton obj1 hashcode: " + obj1.hashCode());
        System.out.println("Singleton obj2 hashcode: " + obj2.hashCode());

        // --- Remove duplicate characters from a string ---
        String str = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (Character ch : set) {
            result.append(ch);
        }
        System.out.println("After removing duplicates: " + result);

        // --- Average salary by department ---
        List<Employees> employees = Arrays.asList(
                new Employees("Amit", "IT", 60000),
                new Employees("Ravi", "HR", 40000),
                new Employees("Suman", "Finance", 75000),
                new Employees("Neha", "IT", 50000),
                new Employees("Raj", "Finance", 90000),
                new Employees("Pooja", "HR", 45000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employees::getDepartment,
                        Collectors.averagingInt(Employees::getSalary)
                ));

        System.out.println("Average salary by department:");
        avgSalaryByDept.forEach((dept, avg) -> System.out.println(dept + ": " + avg));

        // --- Max Profit from Stock Prices ---
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        System.out.println("Max profit from stocks: " + maxProfit);

        // --- Quick Sort ---
        int[] arr = {9, 4, 7, 2, 10, 5};
        System.out.println("Before Quick Sort: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Quick Sort: " + Arrays.toString(arr));
    }

    // --- Quick Sort Implementation ---
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);  // Partition the array
            quickSort(arr, low, pivotIndex - 1);         // Sort left part
            quickSort(arr, pivotIndex + 1, high);        // Sort right part
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing the last element as pivot
        int i = low - 1;        // Smaller element index

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
