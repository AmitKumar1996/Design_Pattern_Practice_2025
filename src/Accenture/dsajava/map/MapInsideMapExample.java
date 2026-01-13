package Accenture.dsajava.map;
import java.util.*;

public class MapInsideMapExample {

    public static void main(String[] args) {

        Map<String, Map<String, Double>> company = new HashMap<>();

        company.put("IT", Map.of(
                "Amit", 120000.0,
                "Rahul", 100000.0
        ));

        company.put("HR", Map.of(
                "Neha", 90000.0,
                "Pooja", 95000.0
        ));

        company.put("Finance", Map.of(
                "Anuj", 150000.0,
                "Ravi", 140000.0
        ));

        // 1️⃣ Print all employees department-wise
        System.out.println("---- Department-wise Employees ----");
        for (Map.Entry<String, Map<String, Double>> deptEntry : company.entrySet()) {
            System.out.println("Department: " + deptEntry.getKey());

            for (Map.Entry<String, Double> empEntry : deptEntry.getValue().entrySet()) {
                System.out.println("  " + empEntry.getKey() + " -> " + empEntry.getValue());
            }
        }

        // 2️⃣ Highest paid employee in each department
        System.out.println("\n---- Highest Paid in Each Department ----");
        for (Map.Entry<String, Map<String, Double>> deptEntry : company.entrySet()) {

            String dept = deptEntry.getKey();
            Map<String, Double> empMap = deptEntry.getValue();

            Map.Entry<String, Double> maxEmp =
                    Collections.max(empMap.entrySet(), Map.Entry.comparingByValue());

            System.out.println(dept + " : " + maxEmp.getKey() + " -> " + maxEmp.getValue());
        }

        // 3️⃣ Overall highest paid employee
        String topEmp = null;
        double maxSalary = Double.MIN_VALUE;

        for (Map<String, Double> empMap : company.values()) {
            for (Map.Entry<String, Double> entry : empMap.entrySet()) {
                if (entry.getValue() > maxSalary) {
                    maxSalary = entry.getValue();
                    topEmp = entry.getKey();
                }
            }
        }

        System.out.println("\nOverall Highest Paid: " + topEmp + " -> " + maxSalary);
    }
}
