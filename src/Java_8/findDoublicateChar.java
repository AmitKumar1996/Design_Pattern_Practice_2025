package Java_8;

import java.util.HashSet;

public class findDoublicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="amiiaaaakaaaaat kkumaeeeer";
		String replace = input.replace(" ", "");
		input=replace;
		
		HashSet<Character> set=new HashSet<>();
		
		int counter=0;
		int max=0;
		
		for(int  i=0;i<input.length();i++) {
			if(set.contains(input.charAt(i))) {
				if(counter>max) {
					max=counter;
					counter=0;
				}
			}
			else {
				set.add(input.charAt(i));
				
				counter++;
			}
		}
		
		System.out.println(max);

	}

}
