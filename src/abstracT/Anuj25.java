package abstracT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Deloitte.salary;

public class Anuj25 {
	
public static void main(  String args[]) {
	
	int[] A= {1,0,1,0,1,0,0};
	
	int fast=A.length-1;
	int slow=A.length-1;
	
	while(fast>=0) {
		if(A[fast]==0) {
			fast--;
			
		}
		else if(A[fast]==1) {
			A[slow]=1;
			A[fast]=0;
			slow--;
			fast--;
			
		}
	}
	
//	for(Integer i: A) {
//		System.out.print(i);
//	}
	
	
	

//I will provide a string, remove all the occurrences of a given character from that string?


String str="anujyadav";

char c='a';

String ans = "";

for(char s: str.toCharArray()) {
	if(s !=c) {
		ans+=s;
	}
	
}

System.out.println(ans);

// Java 8 Program to get Highest paid Employee in Each department using stream api?

List<EmployeeRecord> empList = new ArrayList<>();

empList.add(new EmployeeRecord("IT", 200.0, "Amit"));
empList.add(new EmployeeRecord("HR", 150.0, "Rohit"));
empList.add(new EmployeeRecord("Finance", 300.0, "Neha"));
empList.add(new EmployeeRecord("IT", 250.0, "Suman"));
empList.add(new EmployeeRecord("Admin", 180.0, "Pooja"));
empList.add(new EmployeeRecord("HR", 220.0, "Ankit"));
empList.add(new EmployeeRecord("Finance", 275.0, "Kavita"));
empList.add(new EmployeeRecord("IT", 320.0, "Rahul"));
empList.add(new EmployeeRecord("Support", 160.0, "Priya"));
empList.add(new EmployeeRecord("IT", 290.0, "Vikas"));


Map<String, Optional<EmployeeRecord>> collect = empList.stream().collect(Collectors
		.groupingBy(EmployeeRecord :: getDepartment, Collectors
		.maxBy(Comparator.comparing(EmployeeRecord :: getSalry))));



System.out.println(collect);

	
	
	
	                        
	
	
}

}
