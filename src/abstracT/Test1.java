package abstracT;

public class Test1 {
	
//	
//	public void print(int i,int j) {
//		
//	
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given a set of distinct integers, find all possible subsets (the power set). 

//Sample Input: {1, 2, 3} 
//
//Sample Output: Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]] 
		
		int[] A= {1,2,3};
		
		
		
		
		for(int i=0;i<A.length;i++) {  // 0
			for(int j=0;j<A.length;j++) { // 0
				int x=i;
				int y=j;
				
				while(x<=y) {
					System.out.print(" "+A[x]);
					x++;
				}
				System.out.println();
				
				
			}
		}
	
		
		
		
		
			
//			0 0-> 1 
//			0 1-> 12
//		    0 2->123
//		    10->2
//		    11->

	}

}
