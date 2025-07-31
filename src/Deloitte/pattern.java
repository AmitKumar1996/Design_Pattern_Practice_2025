package Deloitte;

public class pattern {
	
//	*
//	**
//	* *
//	*  *
//	*****

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=4;i++) {
			
			for(int j=0;j<=i;j++) {
				if(i>1 && j!=0 && j!=i) {
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<=4;i++) {
			System.out.print("*");
		}

	}

}
