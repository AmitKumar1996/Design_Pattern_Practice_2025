package Java_8.StreemAPI.mapVsFlatMap.test;

public class TestRecd {
public TestRecd() {
		super();
		// TODO Auto-generated constructor stub
	}

public TestRecd(String patientId, String testName, Boolean isBilled) {
		super();
		this.patientId = patientId;
		this.testName = testName;
		this.isBilled = isBilled;
	}
//	
//	private  String patientId;
//
//	private    String testName;
//
//	private    boolean isBilled;
	
	@Override
	public String toString() {
		return "TestRecd [patientId=" + patientId + ", testName=" + testName + ", isBilled=" + isBilled
				+ ", getPatientId()=" + getPatientId() + ", getTestName()=" + getTestName() + ", getIsBilled()="
				+ getIsBilled() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Boolean getIsBilled() {
		return isBilled;
	}
	public void setIsBilled(Boolean isBilled) {
		this.isBilled = isBilled;
	}
	private String patientId;
	private String testName;
	private Boolean isBilled;

}
