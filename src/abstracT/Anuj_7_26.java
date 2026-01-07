package abstracT;

public class Anuj_7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {1,2,3,4,5,6,7,8,9};
		int[] B= {1,2,3,4,5,6,7,8,9};
		
		int k=2;
		int end=B.length-1;
		//1+8  2+7 3+6 4+5 ->2
		int start=0;
	
		
		while(start<A.length-1 && end >=0) {
			
			if(A[start]+B[end]==k) {
				System.out.println(A[start]+"->"+start+" , "+B[end]+"->"+end);
				start++;
				end--;
			}
			else if(A[start]+B[end]>k) {
				end--;
			}
			else {
				start++;
			}
		}
		
		
		
	}

}
