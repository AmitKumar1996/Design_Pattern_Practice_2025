package Scaler.Array.Arrays_Prefix_Sum;

/**
 * Q3. Pick from both sides!
 *
 * Problem Description:
 * You are given an integer array A of size N. You have to perform B operations. In one operation,
 * you can remove either the leftmost or the rightmost element of the array A.
 *
 * Find and return the maximum possible sum of the B elements that were removed after the B operations.
 *
 * NOTE:
 * Suppose B = 3, and array A contains 10 elements, then you can:
 * - Remove 3 elements from front and 0 elements from back
 * - Remove 2 elements from front and 1 element from back
 * - Remove 1 element from front and 2 elements from back
 * - Remove 0 elements from front and 3 elements from back
 *
 * Constraints:
 * 1 <= N <= 10^5
 * 1 <= B <= N
 * -10^3 <= A[i] <= 10^3
 */

public class PickFromBothSides {

    public int solve(int[] A, int B) {
        int n = A.length;

        // Step 1: Take first B elements sum as initial max_sum
        int current_sum = 0;
        for (int i = 0; i < B; i++) {
            current_sum += A[i];
        }

        int max_sum = current_sum;

        // Step 2: Replace elements from the front with those from the back
        int left = B - 1;
        int right = n - 1;

        while (left >= 0) {
            current_sum -= A[left];
            current_sum += A[right];
            max_sum = Math.max(max_sum, current_sum);
            left--;
            right--;
        }

        return max_sum;
    }

    public static void main(String[] args) {
    	PickFromBothSides sol = new PickFromBothSides();

        // Test Cases
        System.out.println("Running Test Cases...");

        System.out.println(sol.solve(new int[]{5, -2, 3, 1, 2}, 3));  // Expected: 8
        System.out.println(sol.solve(new int[]{1, 2, 3, 4, 5}, 2));   // Expected: 9
        System.out.println(sol.solve(new int[]{-1, -2, -3, -4, -5}, 3)); // Expected: -6
        System.out.println(sol.solve(new int[]{100, -100, 200, -200, 300}, 2)); // Expected: 400
        System.out.println(sol.solve(new int[]{10, 20, 30, 40, 50}, 5)); // Expected: 150
        System.out.println(sol.solve(new int[]{10}, 1)); // Expected: 10
        System.out.println(sol.solve(new int[]{1, -1, 1, -1, 1, -1}, 3)); // Expected: 1
        System.out.println(sol.solve(new int[]{-5, -10, 20, -10, -5}, 3)); // Expected: 0
        System.out.println(sol.solve(new int[]{1, 2, 3, 4, 5, 6}, 4)); // Expected: 18
        System.out.println(sol.solve(new int[]{7, 8, 9, 10}, 2)); // Expected: 19

        System.out.println("✅ All test cases executed.");
    }
}
