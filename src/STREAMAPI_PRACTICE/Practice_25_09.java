package STREAMAPI_PRACTICE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice_25_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello World");
		
		List<Integer> list=List.of(1,2,3,4,5,6);
		int[] A={1,2,3,4,5,6};
		
	Integer max1=Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
		
			System.out.println(max1);
	int max=list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		
			System.out.println(max);
			
			
		
		
		

	}

}
