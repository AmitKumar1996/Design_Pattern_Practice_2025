package Java_8.StreemAPI;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {

	public static void main(String[] args) {
		
	
	               List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9);
	               
	                   asList.stream()
	                          .filter(i -> i % 2 == 0)
	                          .forEach(System.out::print);
	                          
	}	
		
	

	}


