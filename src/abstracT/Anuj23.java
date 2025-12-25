package abstracT;


//System.out.println((-529/ 100 + 1) * 100 );
//
//System.out.println(101/100);
public class Anuj23 {

	public static void main(String[] args) {
		// KADANE's Algoritham
		
	//	int A[]={-2, -3, 4, -1, -2, 1, 5, -3};
		int A[]= {1,2,3,-2};
//		int sum=0;
//		int max=0;
		
//		int s=0;
//		int e=0;
		
		
		int ans=Integer.MIN_VALUE;
		int currentSum=0;
		
	
		
		for(int i=0;i<A.length;i++) {
			
			currentSum+=A[i];
			ans =Math.max(ans, currentSum);
			if(currentSum<0) {
				currentSum=0;
			}
			
			
			
		}
		
		System.out.println(ans);
		
		
		
		
		
		
		int s[]= {7,1,5,3,6,4};
		int max=0;
		int min=0;
		
		for(int i=0;i<s.length;i++) {
			if(max<A[i]) {
				max=A[i];
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<A.length;i++) {
//			
//			if(sum>=0) {
//				sum+=A[i];
//				if(sum>max) {
//					
//					max=sum;
//				}
//			}
//			else {
//				sum=0;
//			}
//			
//		}
//		System.out.println(max);
		
	
//		
//		<- element ->  
//		
//		
//		sum=-2
//		sum=0+ -3 =-3
//		sum=0 + 4 = 4
//		
//		sum=4+ -1 =3
//		sum=3 + -2 =1 + 1=2
//		sum= 2+5=7
//		sum=7-3=4
		
		
		
		
		
		
		

		
		
	
	    
	    
	    

		
	      

	}

}
