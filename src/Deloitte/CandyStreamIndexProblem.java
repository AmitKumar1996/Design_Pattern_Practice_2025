package Deloitte;

import java.util.*;
import java.util.stream.Collectors;

public class CandyStreamIndexProblem {

    // Problem 1: Candy with Wrapper Offer
    // Time Complexity: O(logK) where K = total candies from initial money
    public static int getMaxCandies(int amount, int price, int offerRate) {
        int totalCandy = amount / price;
        int wrappers = totalCandy;
        int ans = totalCandy;

        while (wrappers >= offerRate) {
            int extra = wrappers / offerRate;
            ans += extra;
            wrappers = extra + (wrappers % offerRate); // remaining wrappers
        }
        return ans;
    }

    // Problem 2: Filter Even Numbers
    // Time Complexity: O(N) where N = size of list
    public static List<Integer> filterEven(List<Integer> list) {
        return list.stream()
                   .filter(i -> i % 2 == 0)
                   .collect(Collectors.toList());
    }

    // Problem 3: Remove elements by indexes
    // Time Complexity: O(N + K*logK), where N = size of list, K = number of indexes to remove
    public static List<Integer> removeByIndexes(List<Integer> input, int[] indexes) {
        List<Integer> result = new ArrayList<>(input);
        Arrays.sort(indexes); // O(K*logK)
        for (int i = indexes.length - 1; i >= 0; i--) {
            int idx = indexes[i];
            if (idx >= 0 && idx < result.size()) {
                result.remove(idx); // O(N) worst case per remove
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 🔸 Problem 1: Candy Logic
        int amount = 100;
        int price = 2;
        int offerRate = 4;
        int totalCandies = getMaxCandies(amount, price, offerRate);
        System.out.println("Total candies with Rs " + amount + ": " + totalCandies); // Output: 65

        // 🔸 Problem 2: Stream Filter
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5);
        List<Integer> evenList = filterEven(list);
        System.out.println("Even numbers: " + evenList); // Output: [2, 2, 4]

        // 🔸 Problem 3: Remove by Index
        List<Integer> listToRemoveFrom = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5));
        int[] indexesToRemove = {0, 4, 2};
        List<Integer> updatedList = removeByIndexes(listToRemoveFrom, indexesToRemove);
        System.out.println("List after removing indexes {0, 4, 2}: " + updatedList); // Output: [2, 3, 5]
    }
}
