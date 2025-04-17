package coreJava.collections.ArrayList;

import java.util.HashSet;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {7,9,6,1,5,7,9,1,3,6,3}; // 1 3 5 6 7 9
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++) {
			int temp=array[i];
		int	counter=0;
			for(int j=0;j<array.length;j++) {
				
				if(array[j]==temp ) {
					counter++;
					if(counter>1)
					set.add(temp);
				}
				
			}
				
		}
		System.out.println(set);
		for(Integer i: set) {
			
		}

	}

}
