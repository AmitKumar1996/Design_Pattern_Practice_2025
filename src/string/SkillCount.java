package string;

import java.util.*;
import java.util.stream.*;
class Employee {
    String name;
    int id;
    List<String> skills;
    Employee(String name, int id, List<String> skills) {
        this.name = name;
        this.id = id;
        this.skills = skills;
    }
}
public class SkillCount {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Sachin", 1, List.of("Java", "Oracle", "Angular")),
            new Employee("Manoj", 2, List.of("Java", "Angular")),
            new Employee("Surya", 3, List.of("Angular"))
        );
        Map<String, Long> skillCount =
            employees.stream()
                     .flatMap(e -> e.skills.stream())
                     .collect(Collectors.groupingBy(
                         skill -> skill,
                         Collectors.counting()
                     ));

        System.out.println(skillCount);
        // Output: {Java=2, Oracle=1, Angular=3}
    }
}
