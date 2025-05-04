package Java_8.StreemAPI;

import java.util.stream.IntStream;

//public class fib {
//	
//	
//	public int MyFib(int n) {
//		
//		if(n== 0) return 0;
//		if(n== 1) return 1;
//		
//		return MyFib(n-1)+MyFib(n-2);
//		
//		
//	}
//
//	public static void main(String[] args) {
//		
//		fib obj= new fib();
//		int res= obj.MyFib(5);
//		System.out.println(res);
//		
//		//int result = MyFib(5);
//		
////		  int n = 10; // Find the 10th Fibonacci number
////	        int result = IntStream.range(0, n)
////	                .reduce(0, (a, b) -> (b <= 1 || b<=0) ? b : a + b);
////	        System.out.println("Fibonacci of " + n + " is: " + result);
////		
//	
//	}
//		





public class fib {

    // Method to calculate Fibonacci using recursion
    public int MyFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Corrected: Recursively calculate the Fibonacci sequence
        return MyFib(n - 1) + MyFib(n - 2); // ✅ Corrected logic
    }

    public static void main(String[] args) {
        fib obj = new fib();
        int res = obj.MyFib(5); // Finding 5th Fibonacci number
        System.out.println("Fibonacci of 5 is: " + res);
    }
}




		

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	fib.m();
		
	//	fib obj=new fib();
		
		//int ans=obj.MyFib(5);
		
		
		
	//	System.out.println(ans);
		
		// TODO Auto-generated method stub

	
	
	// 0 1 

//	public static void m() {
//		int n1=0,n2=1,n3=0;
//		
//		for (int i = 0; i < 5; i++) {
//		//System.out.println(n3);
//			 n3=n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//			
//			
//		}
		

//	}



