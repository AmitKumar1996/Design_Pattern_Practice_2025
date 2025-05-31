package Scaler.Array.IntroductionOfArray;

public class MoveAllZeroInRightSide {
	
	
	public static int[] moveZero(int[] Array) {
		
		int index=0;
		for(int i=0;i<Array.length;i++) {
			
			if(Array[i]!=0) {
				Array[index++]=Array[i];
			}
			
			
		}
		
		while(index<Array.length) {
			Array[index++]=0;
		}
		
		return Array;
		
	}

	public static void main(String[] args) {
		
		
		int[] Array={1,2,3,4,5,0,0,0,9};
		//int[] ans=new int[Array.length];
		
		try {
		 int ans[]=moveZero(Array);
		 
		 for(Integer i: ans) {
		System.out.print(i+" ");		
			
		 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		// TODO Auto-generated method stub

	}

}
