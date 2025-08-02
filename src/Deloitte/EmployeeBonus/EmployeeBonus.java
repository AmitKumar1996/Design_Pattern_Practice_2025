package Deloitte.EmployeeBonus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class EmployeeBonus {

    public static void main(String[] args) {

        List<Employee> employes = Arrays.asList(
            new Employee(1, "Amit", "JAVA", LocalDate.of(2025, 7, 1), 50000),
            new Employee(2, "Sumit", "C++", LocalDate.of(2025, 3, 6), 10000),
            new Employee(3, "Namit", "C", LocalDate.of(2025, 8, 3), 10020)
        );
    }

    static class Employee {

        private long id;
        private String name;
        private String dept;
        private LocalDate joiningDate;
        private double salary;

        /**
         * Parameterized Constructor
         * 
         * Purpose:
         * Used when we want to create an Employee object with all details like id, name,
         * department, joining date, and salary.
         * This is commonly used when initializing data or creating objects from input.
         */
        public Employee(long id, String name, String dept, LocalDate joinDate, double salary) {
            this.id = id;
            this.name = name;
            this.dept = dept;
            this.joiningDate = joinDate;
            this.salary = salary;
        }

        /**
         * Default (No-Arg) Constructor
         * 
         * Purpose:
         * This constructor is required when using libraries or frameworks that need a no-arg
         * constructor to create objects through reflection (e.g., Hibernate, Jackson).
         * It also allows creating an empty object and then setting values via setters
         * (if you have setters, which you currently don’t).
         */
        public Employee() {
            super(); // Calls Object class constructor (optional here)
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

        @Override
        public int hashCode() {
            return Objects.hash(dept, id, joiningDate, name, salary);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Employee other = (Employee) obj;
            return Objects.equals(dept, other.dept) &&
                   id == other.id &&
                   Objects.equals(joiningDate, other.joiningDate) &&
                   Objects.equals(name, other.name) &&
                   Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
        }

        @Override
        public String toString() {
            return "Employee{id= " + id +
                   ", Salary= " + salary +
                   ", name= " + name +
                   ", Dept= " + dept +
                   ", JoiningDate= " + joiningDate +
                   '}';
        }
    }
}
