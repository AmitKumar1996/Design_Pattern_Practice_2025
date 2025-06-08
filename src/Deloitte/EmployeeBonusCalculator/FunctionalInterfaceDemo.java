package Deloitte.EmployeeBonusCalculator;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Amit", 50000);
        Employee emp2 = new Employee("Neha", 80000);

        // Strategy 1: Fixed 10% bonus
        BonusCalculator tenPercent = salary -> salary * 0.10;

        // Strategy 2: Higher bonus for high earners
        BonusCalculator performanceBased = salary -> salary > 70000 ? salary * 0.20 : salary * 0.12;

        emp1.applyBonus(tenPercent);           // Amit gets bonus: ₹5000.0
        emp2.applyBonus(performanceBased);     // Neha gets bonus: ₹16000.0
    }
}
