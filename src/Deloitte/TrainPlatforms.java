package Deloitte;

import java.util.*;

/*
 Question 6: Minimum Platforms for Trains

 Problem Statement:
 Given train arrival and departure times, find the minimum number of platforms needed 
 so that no train waits.

 Approach:
 - Sort arrival and departure times.
 - Use two pointers to simulate trains coming and going.
 - Increment platform count when a train arrives before the previous one departs.
 - Decrement when a train departs.

 Time Complexity: O(n log n) — for sorting the arrays
 Space Complexity: O(1) — uses constant extra space
*/

public class TrainPlatforms {

    // Returns the minimum number of platforms required
    public static int minPlatforms(int[] arr, int[] dep) {
        Arrays.sort(arr); // sort arrival times
        Arrays.sort(dep); // sort departure times

        int platforms = 0, maxPlatforms = 0;
        int i = 0, j = 0;

        // Loop through all events in order
        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                platforms++;      // one more train arrived
                i++;
                maxPlatforms = Math.max(maxPlatforms, platforms); // track max
            } else {
                platforms--;      // one train departed
                j++;
            }
        }

        return maxPlatforms;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arrivals = {900, 940, 950, 1100, 1500, 1800};
        int[] departures = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("Minimum Platforms Needed: " + minPlatforms(arrivals, departures));
    }
}
