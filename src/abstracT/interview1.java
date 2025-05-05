package abstracT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="swiss chocolate";
		
		char[] array=str.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<array.length;i++) {
			if(hm.containsKey(array[i])) {
				hm.put(array[i], hm.get(array[i])+1);
			}
			else {
				hm.put(array[i], 1);
			}
		}
		//System.out.println(hm);
	 HashSet<Character> set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			if(hm.get(array[i])>1) {
				set.add(array[i]);
			
			}
		}
		//System.out.println(set);
		
		for(Character Strin:set) {
		System.out.println(Strin+"->"+hm.get(Strin));	
			
		}

	}

}
