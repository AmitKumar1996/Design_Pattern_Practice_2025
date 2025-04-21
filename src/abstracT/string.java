package abstracT;

public class string {
	
	/*
	 * find the second largest word in a string like "i am a good programmer" > "good"
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="i am a good programmer";
		//char[] arr=s.toCharArray();
		
		String[] str=s.split(" ");
		int max=0;
		int secondMax=0;
		

		
		String res=str[0];
		int index=0;
		
		for( int i=0;i<str.length;i++) {
			  String temp=str[i];
			  
			  
		      if(max<temp.length()) {
		    	 
		    	  
		    	  secondMax=max;
		    	 index=i-1;
		    	 
		    	  
		    	  max=temp.length();
		    	  
		      }
		     
		     
		}
		
		System.out.println(str[index]);
		
		System.out.println(secondMax);
		
	
		

	}

}
