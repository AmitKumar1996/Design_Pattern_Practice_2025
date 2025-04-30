package abstracT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private long id;
    private String name;
    private int age;

    public Employee() {}

    public Employee(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class Demo {

    public static void main(String[] args) {
        // 1. Filtering Employees with age >= 30
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Amit", 25));
        list.add(new Employee(2, "Ramit", 32));
        list.add(new Employee(3, "Sumit", 45));
        list.add(new Employee(4, "Rohit", 28));

        List<String> filteredNames = list.stream()
            .filter(emp -> emp.getAge() >= 30)
            .map(i->i.getName())
            .collect(Collectors.toList());

        System.out.println("Employees aged 30 or more: " + filteredNames);

        // 2. Reversing a string using recursion
        String original = "amit";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
