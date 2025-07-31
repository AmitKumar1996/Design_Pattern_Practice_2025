package Deloitte;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeBonusApp {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, 50000, "IT", LocalDate.of(2022, 3, 10)),
            new Employee(2, 55000, "IT", LocalDate.of(2021, 5, 1)),
            new Employee(3, 60000, "HR", LocalDate.of(2023, 1, 15)),
            new Employee(4, 52000, "HR", LocalDate.of(2020, 7, 20)),
            new Employee(5, 48000, "Finance", LocalDate.of(2022, 12, 5))
        );

        // Step 1: Group by dept and get junior-most (earliest joiningDate)
        Map<String, Optional<Employee>> juniorEmployeeByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDept,
                Collectors.minBy(Comparator.comparing(Employee::getJoiningDate))
            ));

        // Step 2: Apply 10% bonus to their salary and collect
        List<Employee> updatedEmployees = juniorEmployeeByDept.values().stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .peek(emp -> emp.setSalary(emp.getSalary() * 1.10))
            .collect(Collectors.toList());

        // Step 3: Print results
        System.out.println("Junior-most employees with 10% bonus applied:");
        updatedEmployees.forEach(System.out::println);
        
        
        System.out.println(employees.toString());
    }

    
    
    // Employee class
    static class Employee {
        private int id;
        private double salary;
        private String dept;
        private LocalDate joiningDate;

        public Employee(int id, double salary, String dept, LocalDate joiningDate) {
            this.id = id;
            this.salary = salary;
            this.dept = dept;
            this.joiningDate = joiningDate;
        }

        public int getId() { return id; }
        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary; }
        public String getDept() { return dept; }
        public LocalDate getJoiningDate() { return joiningDate; }

        @Override
        public String toString() {
            return "Employee{id=" + id +
                   ", salary=" + salary +
                   ", dept='" + dept + '\'' +
                   ", joiningDate=" + joiningDate + '}';
        }
    }
}
