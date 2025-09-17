package abstracT.Enum;

import java.util.HashMap;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 1 2 3 4 5 6 
		//
		
		
		
		
		int[] Array= {0, 1, 2, 3, 4, 5, 6,0,2,3,6,4,-12,18};
		
		int k=6;
		
//		0 0
//		1  1
//		2  2
//		3  3
//		4
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
//		for(int i=0;i<Array.length;i++) {
//			
//			int temp=k-Array[i];
//			
//			if(map.containsKey(temp)) {
//				System.out.println(map.get(temp)+" + "+Array[i]+" = "+k);
//				map.put(Array[i], i);
//			}
//			else {
//				map.put(Array[i], i);
//			}
//		}
		
		
		//HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < Array.length; i++) {
		    int temp = k - Array[i];
		    if (map.containsKey(temp)) {
		        System.out.println(temp + " + " + Array[i] + " = " + k);
		    }
		    // Only put if not already present
		    if (!map.containsKey(Array[i])) {
		        map.put(Array[i], i);
		    }
		}

		
		System.out.println("********************************************************************************");
		
		int[] arr = {0, 1, 2, 3, 4, 5, 6,0,2,3,4,-12};
		//int k = 6;

		int left = 0, right = arr.length - 1;
		while (left < right) {
		    int sum = arr[left] + arr[right];
		    if (sum == k) {
		        System.out.println(arr[left] + " + " + arr[right] + " = " + k);
		        left++;
		        right--;
		    } else if (sum < k) {
		        left++;
		    } else {
		        right--;
		    }
		}

		

	}

}
