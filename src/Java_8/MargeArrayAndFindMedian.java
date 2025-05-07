package Java_8;


import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Write a program to findMedian that takes two unsorted arrays of integers as input 
 * and returns the median element of the combined array.
 * The function should work for arrays of both odd and even lengths. 
 * If the combined array has an odd number of elements, the median should be the middle element.
 * If the combined array has an even number of elements, the median should be the average of the two middle elements.
 * 
 * Example:
 * int[] arr1 = {3, 5, 2};
 * int[] arr2 = {6, 1, 4};
 */

public class MargeArrayAndFindMedian {

    public static void main(String[] args) {
        // Input arrays
        int[] arr1 = {3, 5, 2};
        int[] arr2 = {6, 1, 4};

        
       
        
        // Combine the two arrays into one using Java 8 Streams
        int[] combinedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                                      .sorted()
                                      .toArray();

        // Find and print the median
        double median = findMedian(combinedArray);
        System.out.println("Median: " + median);
    }

    /**
     * Finds the median of a sorted array.
     * 
     * @param sortedArray The sorted array.
     * @return The median value.
     */
    private static double findMedian(int[] sortedArray) {
        int n = sortedArray.length;

        // If the array length is even, return the average of the two middle elements
        if (n % 2 == 0) {
            int mid1 = sortedArray[n / 2 - 1];
            int mid2 = sortedArray[n / 2];
            return (mid1 + mid2) / 2.0;
        }
        // If the array length is odd, return the middle element
        else {
            return sortedArray[n / 2];
        }
    }
}