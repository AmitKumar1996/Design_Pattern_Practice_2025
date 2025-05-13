
		
	//	Given a string, write a function to perform basic string compression using counts of repeated characters. If the compressed string is not shorter than the original string, return the original string.
	//			Example: For "aabcccccaaa", the output should be "a2b1c5a3".
		
package Java_8;

public class CountOfChar {

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = compressString(input);
        System.out.println(result);
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append last character and count
        compressed.append(str.charAt(str.length() - 1)).append(count);

        // Return original string if compressed is not smaller
        return compressed.length() >= str.length() ? str : compressed.toString();
    }
}

