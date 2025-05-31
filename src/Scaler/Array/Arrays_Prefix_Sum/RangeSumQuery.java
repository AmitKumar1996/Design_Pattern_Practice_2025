package Scaler.Array.Arrays_Prefix_Sum;

/**
 * Q4. Range Sum Query
 *
 * Problem Description:
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 *
 * Problem Constraints:
 * 1 <= N, M <= 10^5
 * 1 <= A[i] <= 10^9
 * 0 <= L <= R < N
 *
 * Input Format:
 * The first argument is the integer array A.
 * The second argument is the 2D integer array B.
 *
 * Output Format:
 * Return an integer array of length M where ith element is the answer for ith query in B.
 *
 * Example Input:
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [[0, 3], [1, 2]]
 *
 * Input 2:
 * A = [2, 2, 2]
 * B = [[0, 0], [1, 2]]
 *
 * Example Output:
 * Output 1: [10, 5]
 * Output 2: [2, 4]
 *
 * Explanation:
 * Explanation 1:
 * The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
 * The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
 *
 * Explanation 2:
 * The sum of all elements of A[0 ... 0] = 2 = 2.
 * The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
 */

public class RangeSumQuery {

    // Efficient prefix sum approach
    public long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        long[] prefixSum = new long[n];
        prefixSum[0] = A[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        int m = B.length;
        long[] ans = new long[m];

        for (int i = 0; i < m; i++) {
            int L = B[i][0];
            int R = B[i][1];

            if (L == 0) {
                ans[i] = prefixSum[R];
            } else {
                ans[i] = prefixSum[R] - prefixSum[L - 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        RangeSumQuery sol = new RangeSumQuery();

        // Test Case 1
        int[] A1 = {1, 2, 3, 4, 5};
        int[][] B1 = {{0, 3}, {1, 2}};
        printResult(sol.rangeSum(A1, B1)); // [10, 5]

        // Test Case 2
        int[] A2 = {2, 2, 2};
        int[][] B2 = {{0, 0}, {1, 2}};
        printResult(sol.rangeSum(A2, B2)); // [2, 4]

        // Test Case 3: Single element
        int[] A3 = {100};
        int[][] B3 = {{0, 0}};
        printResult(sol.rangeSum(A3, B3)); // [100]

        // Test Case 4: Full range query
        int[] A4 = {1, 2, 3, 4, 5};
        int[][] B4 = {{0, 4}};
        printResult(sol.rangeSum(A4, B4)); // [15]

        // Test Case 5: Large values
        int[] A5 = {1000000000, 1000000000, 1000000000};
        int[][] B5 = {{0, 2}};
        printResult(sol.rangeSum(A5, B5)); // [3000000000]

        // Test Case 6: Overlapping ranges
        int[] A6 = {5, 10, 15, 20, 25};
        int[][] B6 = {{0, 2}, {1, 3}, {2, 4}};
        printResult(sol.rangeSum(A6, B6)); // [30, 45, 60]

        // Test Case 7: All elements same
        int[] A7 = {7, 7, 7, 7, 7};
        int[][] B7 = {{0, 1}, {2, 4}};
        printResult(sol.rangeSum(A7, B7)); // [14, 21]

        // Test Case 8: Descending array
        int[] A8 = {9, 8, 7, 6, 5};
        int[][] B8 = {{1, 3}, {0, 0}};
        printResult(sol.rangeSum(A8, B8)); // [21, 9]

        // Test Case 9: Alternating high/low
        int[] A9 = {1, 1000, 1, 1000, 1};
        int[][] B9 = {{0, 4}, {1, 3}};
        printResult(sol.rangeSum(A9, B9)); // [2003, 2001]

        // Test Case 10: Only last element
        int[] A10 = {3, 2, 1, 5, 7};
        int[][] B10 = {{4, 4}};
        printResult(sol.rangeSum(A10, B10)); // [7]
    }

    private static void printResult(long[] res) {
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i != res.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
