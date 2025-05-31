package Deloitte;

import java.util.*;



/*
 
 Question 6: Minimum Platforms for Trains
Problem Statement
Given train arrival/departure times, find the minimum platforms needed to avoid waiting.

Approach

Efficient Sorting:

Sort arrival and departure times.

Use two pointers to count overlapping intervals.

Complexity

Time: O(n log n) for sorting.

Space: O(1).


 * */

public class TrainPlatforms {
    public static int minPlatforms(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 0, max = 0;
        int i = 0, j = 0;
        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
                max = Math.max(max, platforms);
            } else {
                platforms--;
                j++;
            }
        }
        return max;
    }
}