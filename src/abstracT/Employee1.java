package abstracT;

public class Employee1 {
    private String name;
    private int age;

    public Employee1(String name2, int age2) {
		// TODO Auto-generated constructor stub
	}



	// Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "SecondHighest{name='" + name + "', age=" + age + '}';
    }
}
