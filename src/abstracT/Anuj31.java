package abstracT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anuj31 {
	
	
//	Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3
//			Output: [3, 2, 1, 6, 5, 4, 8, 7]
//			Explanation: Elements is reversed: [1, 2, 3] → [3, 2, 1], [4, 5, 6] → [6, 5, 4], and the last group [7, 8](size < 3) is reversed as [8, 7].
	
	
	public static void swap(int p1, int p2, int[] A) {
		int s=p1;
		int s2=p2;
		
		while(p1<p2) {
			int temp=A[p1];
			A[p1]=A[p2];
			A[p2]=temp;
			p1++;
			p2--;
		}
		
		for(int i=s;i<=s2;i++) {
			System.out.print(A[i]+" ");
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		int[] A= {1, 2, 3, 4,5,6,7,8};
		int k = 3;
	   
	    
	    int n=A.length;
		
		for(int i=0;i<A.length;i=i) {
			
			int l=i;
			int r=Math.min(i+k-1, n-1);
			
			swap(l,r,A);
			
			
			
			i+=k;
			
			
			
			
			
		}
		
		System.out.println("\n-------------------------------------");
		
		for(Integer i: A) {
			System.out.print(i+" ");
		}
//		Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
//				Output: {3, 4, 5, 6, 1, 2}
		
		
//		int arr[]= {}
		System.out.println("\n-------------------------------------");
		
		
		int arr[] = {1, 2, 3, 4, 5, 2};
			//	Output: [17 5 2]
		
		int max=arr[arr.length-1];
		
		List<Integer> list= new ArrayList<Integer>();
		
		//System.out.println(arr[arr.length-1]);
		
		list.add(arr[arr.length-1]);
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				
				list.add(max);
				//System.out.println(max);
			}
			
		}

		
	 List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(list2);
		
//		Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
//				Output: {3, 4, 5, 6, 1, 2}
//		
//		
//		int ar[]= {1, 2, 3, 4, 5, 6};
//		int key=2;
//		
//		int n1=ar.length;
//		
//		int arrr[]=new int[n1];
//		
//		        // 2 3 4 5  6 1 d=1  0 + 1 % 6= 5
//		        // 3 4 5 6 1 2  d=2
//		        // 4 5 6 1 2 3  d=3
//		        // 5 6 1 2 3 4  d=4
//		        // 6 1 2 3 4 5  d=5
//		        // 1 2 3 4 5 6  d=6
//
//		for(int i=0;i<ar.length;i++) {
//			
//			arrr[n1-key-i]=ar[i];
//			
//		}
//		for(Integer i : arrr) {
//			System.out.print(i+" ");
//		}
//		
//	
//		
//		Input:  arr[ ] = [10, 3, 5, 6, 20]
//				Output: 1200
		int[] Am= {10, 3, 5, 6, 20};
		
		
		List<Integer> list3 = Arrays.stream(Am).boxed()
				.sorted(Comparator.reverseOrder())
				.limit(3).toList();
		System.out.println(list3);
		
		int ans=1;
		
		for(Integer i: list3) {
			ans*=i;
		}
		System.out.println(ans);
		
//		Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
//				Output: 4
		
		int[] arrmax= {0, 1, 0, 1, 1, 1, 1};
		
		int max1=0;
		int ansmax=0;
		
		for(int i=0;i<arrmax.length;i++) {
			
			
			if(arrmax[i]==1) {
				max1++;
				if(max1>ansmax ) {
					ansmax=max1;
				}
			}
		
			else {
				max1=0;
			}
			
		}
		
		System.out.println("Hi->"+ansmax);

			
		int[] in= {1, 2, 4};
		int mul=0;
		
		for(int i=in.length;i>0;i--) {
			mul+in[i]
		}
		
	}

}
