package abstracT;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        k = k % arr.length; // Handle k > arr.length
        reverse(arr, 0, arr.length - 1);          // Step 1: Reverse whole array   6  5 4 3 2 1
        reverse(arr, 0, k - 1);                   // Step 2: Reverse first k elements  5 6 3 2 1  
        reverse(arr, k, arr.length - 1);          // Step 3: Reverse remaining         5 6 1 2 3 

        System.out.println(Arrays.toString(arr)); // Output: [5, 6, 1, 2, 3, 4]
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
