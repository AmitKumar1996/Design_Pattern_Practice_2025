package Java_8;

import java.util.HashMap;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int[] array= {1,2,3,4,5,6,7,8,9};
		
		// 9 8 7 6 5 4 3 2 1
		
		int start=0;
		
		int end= array.length-1;
		//System.out.println(array);
		
		while(start<end) {
			
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0; i<array.length;i++)
		System.out.print(" "+array[i]);
		
		
		String s="aabbccd";
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {  
			char ch=s.charAt(i);
			
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		
		// TODO Auto-generated method stub

	}

}
