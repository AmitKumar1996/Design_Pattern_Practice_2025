package singelton;

public class CreateDao_23_03 {
	private static CreateDao_23_03 createDao_23_03=null;
	
	private static CreateDao_23_03 getInstance() {
		if(createDao_23_03 == null) {
			createDao_23_03 = new CreateDao_23_03();
		}
		return createDao_23_03;
	}

	public static void main(String[] args) {
		CreateDao_23_03 obj1=new CreateDao_23_03().getInstance();
		System.out.println(obj1.hashCode());
		CreateDao_23_03 obj2=new CreateDao_23_03().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
