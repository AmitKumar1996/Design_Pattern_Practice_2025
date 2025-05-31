package Scaler.Array.Arrays_Prefix_Sum;

/**
 * Problem: Special Index
 *
 * Given an array A of integers of size N, the task is to find the count of indices such that
 * removing the element at that index results in equal sum of elements at even and odd indices
 * in the new array.
 *
 * ----------------------
 * Input Format:
 * Integer array A of size N
 *
 * Output Format:
 * An integer denoting the count of such special indices
 *
 * ----------------------
 * Constraints:
 * 1 <= N <= 10^5
 * -10^5 <= A[i] <= 10^5
 * Sum of all elements of A <= 10^9
 *
 * ----------------------
 * Example 1:
 * Input: A = [2, 1, 6, 4]
 * Output: 1
 * Explanation:
 * Removing A[1] => [2, 6, 4] => Even indices = 2 + 4 = 6, Odd index = 6
 *
 * Example 2:
 * Input: A = [1, 1, 1]
 * Output: 3
 * Explanation:
 * Removing any index results in [1, 1] => sum of even and odd indexed values = 1 each
 */

public class RenovingOneIndex {
    public int solve(int[] A) {
        int n = A.length;

        // Prefix sums for even and odd indices
        int[] prefixEven = new int[n];
        int[] prefixOdd = new int[n];

        // Compute prefix sums
        prefixEven[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixEven[i] = prefixEven[i - 1];
            prefixOdd[i] = prefixOdd[i - 1];
            if (i % 2 == 0) {
                prefixEven[i] += A[i];
            } else {
                prefixOdd[i] += A[i];
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            // Sum of even and odd indices before i
            int evenBefore = i > 0 ? prefixEven[i - 1] : 0;
            int oddBefore = i > 0 ? prefixOdd[i - 1] : 0;

            // Sum of even and odd indices after i (shifted due to removal)
            int evenAfter = prefixOdd[n - 1] - prefixOdd[i];
            int oddAfter = prefixEven[n - 1] - prefixEven[i];

            // Check if total even = total odd after removal
            if (evenBefore + evenAfter == oddBefore + oddAfter) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
    	RenovingOneIndex sol = new RenovingOneIndex();

        // Test Cases
        System.out.println("Running Test Cases...");

        assert sol.solve(new int[]{2, 1, 6, 4}) == 1 : "Test 1 Failed";
        assert sol.solve(new int[]{1, 1, 1}) == 3 : "Test 2 Failed";
        assert sol.solve(new int[]{1}) == 1 : "Test 3 Failed (single element)";
        assert sol.solve(new int[]{5, 5}) == 2 : "Test 4 Failed";
        assert sol.solve(new int[]{0, 0, 0, 0, 0}) == 5 : "Test 5 Failed (all zero)";
        assert sol.solve(new int[]{1, 2, 3, 4, 5, 6}) == 1 : "Test 6 Failed";
        assert sol.solve(new int[]{10, -10, 10, -10, 10, -10}) == 0 : "Test 7 Failed";
        assert sol.solve(new int[]{100, 200, 100, 200, 100}) == 1 : "Test 8 Failed";
        assert sol.solve(new int[]{1, 2}) == 0 : "Test 9 Failed (minimal case)";
        assert sol.solve(new int[]{3, 3, 3, 3, 3, 3, 3}) == 7 : "Test 10 Failed";

        System.out.println("✅ All test cases passed successfully!");
    }
}
