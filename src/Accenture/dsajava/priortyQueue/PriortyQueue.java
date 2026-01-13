package Accenture.dsajava.priortyQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;

import javax.swing.SortOrder;

public class PriortyQueue {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		  List<Employee> empList=Arrays.asList(new Employee( 1, "Anuj", 1000),
				                           new Employee(2, "Anuj3", 10090),
				                           new Employee(1, "Anuj2", 100800)
				  
				  
				  
				  
				  );
		       
		  
		//  System.out.println(empList);

		  
		// Step 2: Create PriorityQueue with comparator (MAX salary first)
	        Queue<Employee> pq = new PriorityQueue<>(
	                (e1,e2)-> e1.getName().compareTo(e2.getName())
	                // 👆 reversed comparison for highest salary priority
	        );

	        // Step 3: Add all employees to priority queue
	        for (Employee e : empList) {
	            pq.add(e);
	        }

	        // Step 4: Poll employees (highest salary first)
	        while (!pq.isEmpty()) {
	            System.out.println(pq.poll());
	        }
		
		  
		  
	}

}
