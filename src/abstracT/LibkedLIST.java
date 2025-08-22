package abstracT;

import java.util.LinkedList;

public class LibkedLIST {

	public static void main(String[] args) {
		
//		Given an array of elements, where all the elements appear two time except one element. Find the element that appears only one time.
//
//		space complexity should be O(1).
//		Input = {1,1,3,3,2,2,5,7,7}
//		Output = 5
		
		int A[]={1,1,3,3,2,2,5,7,7};
		
		int ans=A[0];
		
		for(int i=1;i<A.length;i++) {
			
			ans ^=A[i];
			
		}
		System.out.println(ans);
		
		
		
		
		// TODO Auto-generated method stub
//		
//		list1 = [1,2,4],
//				list2 = [1,3,4]
//				Output: [1,1,2,3,4,4]
						
//					//	LinkedList<Integer> l1=new LinkedList<Integer>();
//		class Node{
//			
//			int data;
//			Node left;
//			Node right;
//		}
//		
//		
//		Example 1:
//			Input: nums = [0,1,0,3,12]Output: [1,3,12,0,0]
//			Example 2:
//			Input: nums = [0]Output: [0]
		
//		int A[]= {0,1,0,3,12};
//		
//		int index=0;
//		int end=A.length-1;
//		
//		//System.out.println(end);
//		
//		for(int i=0;i<A.length;i++) {   
//			if(A[i]!=0) {
//				A[index++]=A[i];
//				System.out.println(A[index-1]);
//			}
//			else {
//				A[end--]=0;
//			}
//		}
////		while(index<A.length) {
////			A[index++]=0;
////		}
//		
////		for(int i=0;i<A.length;i++) {
////			System.out.print(" "+A[i]);
////		}
////		
//					

	}

}
