package Deloitte.EmployeeBonus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeBonus {
	
	
public static void main(String[] args) {
	
	List<Employee> employes = Arrays.asList(
			new Employee(1, "Amit", "JAVA", LocalDate.of(2025, 7, 1), 50000),
			new Employee(2, "Sumit", "C++", LocalDate.of(2025, 3, 6), 10000),
			new Employee(3, "Namit", "C", LocalDate.of(2025, 8, 3), 10020)
			
			
			);
}
	
	
 static	class Employee{
		
		private long id;
		private String name;
		
		private String dept;
		
		private LocalDate joiningDate;
		
		private double salary;
		
		
		public Employee(long id, String name, String dept, LocalDate joinDate, double salary) {
			this.id=id;
			this.name= name;
			this.dept=dept;
			this.joiningDate=joinDate;
			this.salary=salary;
		}
		
		public long getId() {
			return this.id;
		}
		
		public String getName() {
			return name;
		}
		public String getDept() {
			return dept;
		}
		
		public LocalDate getJoningDate() {
			return joiningDate;
		}
		
		public double getSalary() {
			return salary;
		}
		
		
		public String toString() {
			return "Employee{id= "+id+
					"Salary= "+salary+
					"name= "+name+
					"Dept= "+dept+
					"JoiningDate= "+joiningDate+
					'}';
		}
		
	}

}
