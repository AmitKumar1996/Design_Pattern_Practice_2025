package Scaler.Array.IntroductionOfArray;

import java.util.HashMap;
import java.util.HashSet;

public class GoodPair {
	
	// using Map and set 
	
	public boolean TargetExits(int Array[], int target) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(Integer i:Array) {
		
		if(set.contains(target-i)) {
			return true;
			
		}
		else {
			set.add(i);
		}
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		
		int[] Array= {3,-2,1,4,3,6,8};
		int target=10;
		
		GoodPair obj=new GoodPair();
		
		System.out.println(obj.TargetExits(Array, target));
	}

}
