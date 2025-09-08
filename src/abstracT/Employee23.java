package abstracT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee23 {

    public String name;
    public int salary;

    public Employee23() {
        super();
    }

    public Employee23(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee23 [name=" + name + ", salary=" + salary + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
      
        Employee23 o1 = new Employee23("A", 100);
        Employee23 o2 = new Employee23("B", 200);
        Employee23 o3 = new Employee23("C", 300);
        Employee23 o4 = new Employee23("D", 400);
        Employee23 o5 = new Employee23("E", 500);

   
        List<Employee23> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);

        System.out.println(list);

        List<Employee23> sortedList = list.stream()
                .sorted(Comparator.comparingInt(Employee23::getSalary))
                .collect(Collectors.toList());
       

        System.out.println(sortedList);
    }
}
