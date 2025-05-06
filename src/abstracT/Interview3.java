package abstracT;

/*
 
 
Problem:

Design and implement a request rate limiter (like an API gateway component) that limits each user to N requests per T seconds.

Use Java 8
Implement concurrency control
Design pattern expectation: Singleton + Strategy (for different algorithms: token bucket, leaky bucket, etc.)
 
Input  RateLimiter limiter = RateLimiterFac... by Prabakaran, Shunmugaraj
Prabakaran, Shunmugaraj
12:06 PM

Input 

RateLimiter limiter = RateLimiterFactory.getRateLimiter("TOKEN_BUCKET", 3, 10); // 3 requests per 10 sec
System.out.println(limiter.allowRequest("user1")); // true
System.out.println(limiter.allowRequest("user1")); // true
System.out.println(limiter.allowRequest("user1")); // true
System.out.println(limiter.allowRequest("user1")); // false


 * */

public class Interview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
