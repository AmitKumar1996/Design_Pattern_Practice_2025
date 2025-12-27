package abstracT;

public class EmployeeRecord {
	
	private String department;
	
	private Double salry;
	
	private String name;

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the salry
	 */
	public Double getSalry() {
		return salry;
	}

	/**
	 * @param salry the salry to set
	 */
	public void setSalry(Double salry) {
		this.salry = salry;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeRecord [department=" + department + ", salry=" + salry + ", name=" + name + "]";
	}

	/**
	 * @param department
	 * @param salry
	 * @param name
	 */
	public EmployeeRecord(String department, Double salry, String name) {
		super();
		this.department = department;
		this.salry = salry;
		this.name = name;
	}

	/**
	 * 
	 */
	public EmployeeRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
