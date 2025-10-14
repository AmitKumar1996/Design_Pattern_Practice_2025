package STREAMAPI_PRACTICE;
import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private String dept;
    private double salary;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + dept + " - " + salary + ")";
    }
}

public class SecondHighest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR", 50000),
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 55000),
                new Employee("Jane", "IT", 62000),
                new Employee("Eva", "Finance", 70000),
                new Employee("Michael", "Finance", 75000)
        );
        
//        employees.stream().collect(Collectors.groupingBy(Employee :: getDept), Collectors.collectingAndThen(Collectors.toList(), list-> list.stream().sorted(
//        		
//        		
//        		
//        		Comparator.comparingDouble(Employee:: getSalary).reversed()
//        		
//        		
//        		).skip(1).findFirst()
//        		
//        		
//        		
//        		
//        		
//        		);
//        
        
        
        
        Map<String, Optional<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee:: getDept,
        		
        		
        		
        		Collectors.collectingAndThen(Collectors.toList(),list-> list.stream().sorted(Comparator.comparing(Employee:: getSalary)).skip(1).findFirst())
        		)
        		
        		
        		
        		
        		
        		
        		);
        
        
        System.out.println(collect);
        
//        
//       collect.forEach((dept, emp) System.out.println(dept+""+emp));
//        
        
        

//        Map<String, Optional<Employee>> secondHighestByDept =
//                employees.stream()
//                        .collect(Collectors.groupingBy(
//                                Employee::getDept,
//                                Collectors.collectingAndThen(
//                                        Collectors.toList(),
//                                        list -> list.stream()
//                                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//                                                .skip(1) // skip highest
//                                                .findFirst()
//                                )
//                        ));

//        // Print results
//        secondHighestByDept.forEach((dept, emp) ->
//                System.out.println(dept + " -> " + emp.orElse(null)));
        
        
        
    }
}
