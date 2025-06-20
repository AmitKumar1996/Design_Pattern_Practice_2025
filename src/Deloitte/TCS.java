package Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TCS {

	public static void main(String[] args) {
		
		int sum=0;
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		
          List<Integer> collect = list.stream().filter(i->i%2 !=0).collect(Collectors.toList());
         for(Integer i: collect) {
        	 sum+=i;
         }
	System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// TODO Auto-generated method stub
//		           //0 1 2  3 4
//		int[] Array={1,2,3,4,5};
//	//	              0 1 2 3 4
//		//            4 5 1 2 3     (0+2) % 5=2    (1+2)%5=3
//		
//		int n=Array.length;
//		    
//		
//		int k=3;
//		
//		int[] ans=new int[n];
//		
//		for(int i=0;i<Array.length;i++) {
//			
//			int temp=(i+k)%n;
//			ans[temp]= Array[i];
//			
//			
//		}
//
//
//		for(Integer i: ans) {
//			System.out.print(i+" ");
//		}
		
		
//		
//		
//		Given a list - 1,2,3,4,5,6.
//		  Find the sum of all odd number using stream api.

	}

}
