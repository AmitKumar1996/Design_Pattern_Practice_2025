package Deloitte;
public class zeroOne {
	
	// segregate 0's and 1's in array {1,0,0,1,0,1,1,0,0}
	
	public static void main(String[] args) {
		
		int[] A= {1,0,0,1,0,1,1,0,0};
		
		int index=A.length-1;
		
		for(int i=A.length-1;i>=0;i--) {
			if(A[i]!=0)
			A[index--]=A[i];
		}
		while(index>=0) {
			A[index--]=0;
		}
//		
//		for(Integer i: A) {
//			if(i!=0) {
//				A[index++]=i;
//			}
//			
//		}
//		while(index<A.length) {
//			A[index++]=0;
//			
//		}
//		
		
		
		for(Integer i: A) {
			System.out.print(" "+i);
		}
		
		
		
	}
	
	

}
