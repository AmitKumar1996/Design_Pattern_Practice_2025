package Java_8;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "aabbccd";
        
      HashMap<Character, Integer> map= new HashMap<>();
       for(int i=0;i<s.length();i++) {
    	   char c=s.charAt(i);
    	   if(map.containsKey(c)) {
    		   map.put(c, map.get(c)+1);
    	   }
    	   else {
    		   map.put(c, 1);
    	   }
       }
       
       for (char key : map.keySet()) {
    	    System.out.println("Key: " + key + ", Value: " + map.get(key));
    	}
    	/*
    	Output:
    	Key: a, Value: 2
    	Key: b, Value: 2
    	Key: c, Value: 2
    	Key: d, Value: 1
    	*/
       for (var entry : map.entrySet()) {
    	    System.out.println(entry.getKey() + " -> " + entry.getValue());
    	}
    	/*
    	Output:
    	a -> 2
    	b -> 2
    	c -> 2
    	d -> 1
    	*/
       
       map.forEach((k, v) -> System.out.println(k + " : " + v));
       /*
       Output:
       a : 2
       b : 2
       c : 2
       d : 1
       */
       for (int value : map.values()) {
    	    System.out.println(value);
    	}
    	/*
    	Output:
    	2
    	2
    	2
    	1
    	*/

       
       for (var entry : map.entrySet()) {
    	    System.out.println(entry.toString());
    	}
    	/*
    	Output:
    	a=2
    	b=2
    	c=2
    	d=1
    	*/
       map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));
       /*
       Output:
       a => 2
       b => 2
       c => 2
       d => 1
       */

       var iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
           var entry = iterator.next();
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
       /*
       Output:
       a : 2
       b : 2
       c : 2
       d : 1
       */
       StringBuilder sb = new StringBuilder();
       map.forEach((k, v) -> sb.append(k).append(" occurs ").append(v).append(" times\n"));
       System.out.println(sb);
       /*
       Output:
       a occurs 2 times
       b occurs 2 times
       c occurs 2 times
       d occurs 1 times
       */
       map.entrySet().stream()
       .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
       .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
/*
Output:
a : 2
b : 2
c : 2
d : 1
*/


     System.out.println(map);
    
    		  
    }
}
