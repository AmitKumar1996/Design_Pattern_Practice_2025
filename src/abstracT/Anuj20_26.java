package abstracT;

public class Anuj20_26 {
	
 public static void main(String[] args) {
	 
	 String str= "abcdef";
	 
	 int n=str.length();
	 boolean even = false,odd;
	
	 if(n%2==0) {
		 even=true;
	 }
	 else 
	 {
		odd=true; 
	 }

	// output: ['ab','cd','e_'];
	 int[] ans=new int[n/2];
	 
	 int index=0;
	 
	 
	 if(even) {
	 
	 for(int i=0;i<str.length()-1;i++) {
		 

		 
		 ans[index++]=str.charAt(i)+str.charAt(i+1);
		 
	 }
	 }
	 
	 for(int i:ans) {
		 System.out.println(i);
	 }
 }

}
