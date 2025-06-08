package abstracT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaabbbbbcccczzxxdeeefhiijklm";
		
		String temp="";
		
		

		 //ab bc cde efhi ijklm
		
		char[] A=str.toCharArray();
		
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		
		for(int i=0;i<A.length;i++) {
			
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i])+1);
			}else {
				hm.put(A[i], 1);
			}
		}
		System.out.println(hm);
		
		
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()));
		
		System.out.println(collect);
		
		
		
		int[] array= {-5, -4, -3, -2, -1,0,1,2,3,4,5,7};
		
		
		
		Optional<Integer> first = Arrays.stream(array).boxed().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
		System.out.println(first.get());
		
		//    2 4
		
		
//		ArrayList<Integer> Alist=new ArrayList<>();
//		for(int i=0;i<array.length;i++) {
//			Alist.add(array[i]);
//		}
		
		
//	ArrayList<Integer>  ans= (List<Integer>) Alist.stream().filter(i->i>0 && i%2==0);
//	
//	System.out.println(ans);
		
//		ArrayList<String > list=new ArrayList<>();
//		
//		for(int i=0;i<A.length-2;i++ ) {
//			
//			System.out.println(i);
//			if(A[i]==A[i+1]) {
//				System.out.println("this is if:-> "+temp +"::::"+i+ ""+A[i]+"  "+A[i+1]);
//				continue;
//			}
//			else {
//			//	Boolean flag=true;
//				temp=temp+ A[i];
//				continue;
//				
//			//	System.out.println("this is else:-> "+temp +"::::"+i+ ""+A[i]+"  "+A[i+1]);
////				while(flag) {
////					
////					System.out.println(i+ "" + flag+""+A[i]+"  "+A[i+1]);
////					
////					if(A[i]!=A[i+1]) {
////						temp=temp+A[i+1];
////						i++;
////						
////					}
////					else{
////						flag=false;
////					}
////					
////				}
//				
//			
//				
//			
//				
//			}
//			list.add(temp);
//		}
//		
//		System.out.println(list);
		
				

	}

}
