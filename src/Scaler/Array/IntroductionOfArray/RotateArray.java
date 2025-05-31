package Scaler.Array.IntroductionOfArray;

public class RotateArray {
	
	public static int[] rotateArray(int Array[], int k) {
		//  {3,-2,1,4,6,9,8};    
//  k=1   8 3 -2 1 4 6 9     0 + 1 % Array.length;
		
// k=2    9 8 3 -2 1 4 6 9
		
		int[] ans=new int[Array.length];
		
		for(int i=0;i<Array.length;i++) {
			ans[(i+k)%Array.length]=Array[i];
			
			
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array[]= {3,-2,1,4,6,9,8};
		int k=1;
		
		int ans[]=new int[Array.length];
		
		try {
			ans=rotateArray(Array, k);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		for(Integer i: ans) {
			System.out.println(i+" ");
		}
		
		

	}

}
