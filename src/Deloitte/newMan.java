package Deloitte;

import java.util.HashSet;

public class newMan {

    public static void main(String[] args) {
        String input = "abcadbcdbbcabc";
        int maxLength = findLongestUniqueSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }

    public static int findLongestUniqueSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
