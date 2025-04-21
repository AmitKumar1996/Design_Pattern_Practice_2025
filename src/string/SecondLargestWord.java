package string;
public class SecondLargestWord {

    /*
     * Find the second largest word in a string like "i am a good programmer"
     * Output: "good"
     */

    public static void main(String[] args) {
        String s = "i am a good programmer";

        String[] words = s.split(" ");
        String largest = "";
        String secondLargest = "";

        for (String word : words) {
            if (word.length() > largest.length()) {
                secondLargest = largest; // update second before overwriting
                largest = word;
            } else if (word.length() > secondLargest.length() && !word.equals(largest)) {
                secondLargest = word;
            }
        }

        System.out.println("Second largest word: " + secondLargest);
    }
}
