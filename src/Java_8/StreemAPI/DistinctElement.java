package Java_8.StreemAPI;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> array=new ArrayList<>();
		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(1);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(1);
		array.add(5);
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		for(Integer i : array) {
			set.add(i);
		}
		System.out.println(set);

	}

}
