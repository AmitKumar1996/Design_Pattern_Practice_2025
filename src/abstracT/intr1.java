package abstracT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public class intr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	write an efficient java program to find that missing number.   int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
		
		int[] arr = {1, 2, 3, 4, 5, 8, 9, 10};
		 
		int counter=0;
		
		for(int i=0;i<arr.length;i++) {
			counter++;
			if(arr[i]==counter) {
				continue;
				
				
			}
			else {
				System.out.println(counter);
				i++;
				
			}
		}
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
				}
				System.out.println();
			}
		

			
		

		

	}

}
