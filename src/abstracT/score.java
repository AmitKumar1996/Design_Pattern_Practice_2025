package abstracT;

public class score {
	
	private String Dept;
	private  int marks;
	/**
	 * @return the dept
	 */
	public String getDept() {
		return Dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		Dept = dept;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "score [Dept=" + Dept + ", marks=" + marks + "]";
	}
	/**
	 * @param dept
	 * @param marks
	 */
	public score(String dept, int marks) {
		super();
		Dept = dept;
		this.marks = marks;
	}
	/**
	 * 
	 */
	public score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
