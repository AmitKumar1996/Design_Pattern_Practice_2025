package singelton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CreateDao_05_21 {
	
	private static CreateDao_05_21 createDao_05_21=null;
	
	private static CreateDao_05_21 getInstance() {
		
		if(createDao_05_21 == null) {
			createDao_05_21=new CreateDao_05_21();
			
		}
		return createDao_05_21;
	}

	public static void main(String[] args) {
		
		
		List<Integer> arr= Arrays.asList(1,2,3,4);	
		
            Optional<Integer> SecondHighest = arr.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
            System.out.println(SecondHighest.get());
            
            int[] A= {1,2,3,4,5,6,7,8,9,10};
            
      Optional<Integer> secondhighest=      Arrays.stream(A).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
      
      System.out.println(secondhighest.get());
		
		CreateDao_05_21 obj1=new CreateDao_05_21().getInstance();
		System.out.println(obj1.hashCode());
		
		
		CreateDao_05_21 obj2=new CreateDao_05_21().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
