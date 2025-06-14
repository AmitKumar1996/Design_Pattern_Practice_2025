package abstracT;

public class yatra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="vartikao";
		
		//s=0 e=3
		
		// AEIOU
		
		// imat
		
		// aeiou->  uoiea
		
		// wetiosaoa--> waeaos
		
		
		char[] A=str.toCharArray();
//		for(Character i: A) {
//			System.out.print(i);
//			
//		}
		
		
		String ans="";
		
		int start=0;
		int end=str.length()-1;
		
	
		while(start<end) {
			
			if(A[start]=='a' ||A[start]=='e' || A[start]=='i' || A[start]=='o' || A[start]=='u') {
				if(A[end]=='a' ||A[end]=='e' || A[end]=='i' || A[end]=='o' || A[end]=='u') {
					char temp=A[start];
					A[start]=A[end];
					A[end]=temp;
					start++;
					end--;
				}
				else {
					end--;
				}
				
			}
			else {
				start++;
			}
			
		}
		
		for(Character i: A) {
			System.out.print(i);
			
		}	
		for(int i=A.length;i<=0;i--) {
			
		if((A[i]!='a' ) ||(A[i]!='e') || (A[i]!='i') || (A[i]!='o') || (A[i]!='u') ){
			ans+=A[i];
			
		}
		else {
			
		}
			
			
			
			
		}

	}

}
