package abstracT;

public class Anuj_7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] A= {1,2,3,4,5,6,7,8,9};
//		int[] B= {1,2,3,4,5,6,7,8,9};
//		
//		int k=2;
//		int end=B.length-1;
//		//1+8  2+7 3+6 4+5 ->2
//		int start=0;
//	
//		
//		while(start<A.length-1 && end >=0) {
//			
//			if(A[start]+B[end]==k) {
//				System.out.println(A[start]+"->"+start+" , "+B[end]+"->"+end);
//				start++;
//				end--;
//			}
//			else if(A[start]+B[end]>k) {
//				end--;
//			}
//			else {
//				start++;
//			}
//		}
//		
		
		
//		1  2  3  4
//		5  6  7  8
//		9 10 11 12
//		13 14 15 16
//
//		 
//
//		The output should be: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
		
	//	0,0  0,1 0,2 0,3  1,3 2,3 3,3 3,2 3,1 3,0 2,0 1,0 1,1 1,2 2,2 2,1
		
//		Input:
//			1  2  3
//			4  5  6
//			7  8  9
//
//			 
//
//			Output:
//			7  4  1
//			8  5  2
//			9  6  3
		
		int[][] A={ {1,2,3},{4,5,6},{7,8,9}};
		
		int row=A.length;
		int col=A[0].length-1;
		int[][] B=new int[row][col];
		//System.out.println(A[0].length); // column
		//System.out.println(A.length); // row
		
		for(int i=col;i>=0;i--) {
			
			for(int j=0;j<row;j++) {
				
				System.out.println(A[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
