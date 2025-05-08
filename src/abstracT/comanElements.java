package abstracT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comanElements {
	
	
	/*
	 * 
	 * find out common element using stream api.

l1 ={1,2,3,4,5,6,9,10,11}

l2 = {1,3,5,7,9,11} o/p - 1,3,5,9,11
	 * */ss

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> l1=new ArrayList<>();
//		
//		l1.stream().filter(l1.)
		

//Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.

//Example 1:Input: arr = [4, 7, 1, 0]
		//Output:  7 1 0
		
		int[] arr= {4,7,1,0};

   
        
        int l=arr.length-1;
        int max=arr[l];
        
        System.out.print(" "+arr[l]);

        for(int i=arr.length-2;i>=0;i--) {
        	
        	if(max<arr[i]) {
        		System.out.print(" "+arr[i]);
        		max=arr[i];
        	}
        }

		//while() {}  O 2(n)

	}

}
