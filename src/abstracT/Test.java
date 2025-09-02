package abstracT;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	
	
	
	
//	Function Signature:
//		class RateLimiter {
//		    public RateLimiter(int maxRequests, int windowInSeconds);
//		    
//		    maxRequests=10;
//		    windowInSeconds=60sec;
//		    1->1
//		    
//		    
//		    public boolean allowRequest(String userId);
//		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		ArrayList<Map<Integer, Integer>> listMap= (ArrayList<Map<Integer, Integer>>);
		List<String> list=new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		a
	list.stream().sorted((s1,s2)->{ return 
		-s1.substring(1).compareTo(s2.substring(1));
				
				
				}).forEach(i-> System.out.println(i));
		
	//	System.out.println(collect);
		
		
		

//Design and implement a RateLimiter class in Java that limits the number of requests per user within a fixed time window. Assume this will be used in a Spring Boot microservice to throttle API calls.
//Requirements:
//
//Each user is allowed N requests per T seconds.
//
//If the user exceeds the limit, further requests should be rejected until the window resets.
//
//The solution should be thread-safe and performant under high concurrency.

	}

}
