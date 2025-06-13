package abstracT;

import java.util.*;
import java.util.stream.Collectors;

public class EmpList {
    public static void main(String[] args) {
        // Sample data
        List<Employee1> employees = Arrays.asList(
            new Employee1("John", 28),
            new Employee1("Alice", 35),
            new Employee1("Bob", 32),
            new Employee1("Daisy", 25),
            new Employee1("Charlie", 45)
        );

        // Filter age > 30 and sort by name
        List<Employee1> sortedEmployees = employees.stream()
            .filter(e -> e.getAge() > 30)
            .sorted(Comparator.comparing(Employee1::getName))
            .collect(Collectors.toList());

        // Print result
        sortedEmployees.forEach(System.out::println);
    }
}
