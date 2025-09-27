package Deloitte.EmployeeBonusCalculator;

public class Employee {
	private	String name;
	private double salary;
	
	
public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}



@Override
	public String toString() {
		return "SecondHighest [name=" + name + ", salary=" + salary + "]";
	}


public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	 public void applyBonus(BonusCalculator calculator) {
	        double bonus = calculator.calculate(this.salary);
	        System.out.println(name + " gets bonus: ₹" + bonus);
	    }

	

}
