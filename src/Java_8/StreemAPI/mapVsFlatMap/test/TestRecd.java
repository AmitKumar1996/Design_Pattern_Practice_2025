package Java_8.StreemAPI.mapVsFlatMap.test;

public class TestRecd {

    private String patientId;
    private String testName;
    private Boolean isBilled;

    public TestRecd() {}

    public TestRecd(String patientId, String testName, Boolean isBilled) {
        this.patientId = patientId;
        this.testName = testName;
        this.isBilled = isBilled;
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

    @Override
    public String toString() {
        return "TestRecd [patientId=" + patientId + ", testName=" + testName + ", isBilled=" + isBilled + "]";
    }
}
