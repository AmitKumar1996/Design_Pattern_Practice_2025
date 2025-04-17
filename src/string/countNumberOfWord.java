package string;

import java.util.HashMap;


public class countNumberOfWord {
	

	public class Main {
	    public static void main(String[] args) {
	        String str = "Amit Kumar amit kumar";

	        // Make it case-insensitive
	        str = str.toLowerCase();

	        HashMap<String, Integer> map = new HashMap<>();

	        String[] words = str.split(" ");

	        for (String word : words) {
	            if (map.containsKey(word)) {
	                map.put(word, map.get(word) + 1);
	            } else {
	                map.put(word, 1);
	            }
	        }

	        // Print the result
	        for (String key : map.keySet()) {
	            System.out.println(key + " = " + map.get(key));
	        }
	    }
	}


}
