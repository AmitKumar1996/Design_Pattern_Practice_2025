package Java_8;
import java.util.*;
public class CharMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="hello";  // l
	HashMap<Character, Integer> map= new HashMap<>();
	int max=0;
	
	
	for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		
		}
		else {
			map.put(c, 1);
		}
	}
	System.out.println(map);
	
	char result = 0;
//// Find the most frequent character
    for (char key : map.keySet()) {
        if (map.get(key) > max) {
            max = map.get(key);
            result = key;
        }
    }
    System.out.println(result);
	

	}

}
