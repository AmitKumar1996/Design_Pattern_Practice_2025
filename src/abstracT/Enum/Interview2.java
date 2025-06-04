package abstracT.Enum;

import java.util.LinkedHashSet;

public class Interview2 {

    public static void main(String[] args) {
        String str = "abcakljjmnbvcxzipsddfesgsrb";
        
        // Step-by-Step Algorithm:
        // 1. Use LinkedHashSet to maintain insertion order and uniqueness.
        // 2. Use a StringBuilder to keep the current unique substring.
        // 3. Track the longest substring found so far.


        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String longestSubstring = "";
        StringBuilder currentSubstring = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                // Update result if needed
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring.toString();
                }

                // Remove characters until duplicate is removed
                while (set.contains(ch)) {
                    char first = currentSubstring.charAt(0);
                    currentSubstring.deleteCharAt(0);
                    set.remove(first);
                }
            }

            set.add(ch);
            currentSubstring.append(ch);
        }

        // Final check after loop
        if (currentSubstring.length() > longestSubstring.length()) {
            longestSubstring = currentSubstring.toString();
        }

        System.out.println("✅ Longest unique substring: " + longestSubstring);
        System.out.println("🔢 Length: " + longestSubstring.length());
    }
}
/*
🧪 Example
Input: "abcasddfesgsrb"



Sliding window moves like:

a -> ab -> abc -> abca (duplicate 'a')
=> store 'abc' as longest, remove 'a', continue with 'bca' -> 'bcas' -> ...

Final longest unique substring: 'casdfe'
Output:


Longest unique substring: casdfe
Length: 6



*/

/*
📘 ALGORITHM: Longest Substring Without Repeating Characters
-----------------------------------------------------------
Input: A string 's'
Output: Longest substring without repeating characters

1. Initialize:
   - A LinkedHashSet to store characters in current window
   - Strings to track current and longest substrings

2. Traverse each character 'ch' in string:
   - If 'ch' is in set:
       - Update result if current is longer than longest
       - Remove chars from start of current until 'ch' is removed
   - Add 'ch' to set and currentSubstring

3. After loop, check one last time if current is longest

Time Complexity: O(n)
Space Complexity: O(k) where k = number of unique characters
*/


/*
 package abstracT.Enum;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String str = "abcasddfesgsrb";
		String str="abcdef";
		
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		
	 System.out.println(collect);
		
	 
	 
//	 PostMaping("/user/id")
//	 public int sumController(@PathVaribale("id") Long id) {
//		 
//		 return id*id;
//	 }
	 
	 

		// dfesg
	 

	
	    int max=1;
	    int current=1;
	    
	    
	    
	    LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	    
	 //   HashSet<Character> set=new HashSet<Character>();
	    
	    for(int i=0;i<str.length();i++) {
	    	
	   
	    	
	    	if(set.contains(str.charAt(i))) {
	    		
	    		if(max<current) {
	    		
		    		max=current;
		    		set.removeAll(set);
		    		set.add(str.charAt(i));
		    	}
	    		current=1;
	    		
	    		
	    	}
	    	else {
	    		
	   
	    		set.add(str.charAt(i));
	    		current++;
	    	}
	    	
	    	if(max<current) {
	    		max=current;
	    		set.removeAll(set);
	    		set.add(str.charAt(i));
	    	}
	    }
	    
	    System.out.println(set);

	    

				
		
	}

}
 * */
