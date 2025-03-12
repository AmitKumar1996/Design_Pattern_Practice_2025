package singelton;

public class CreateDao_12_03 {
	private static CreateDao_12_03 createDao_12_03=null;
	
	private static CreateDao_12_03 getInstance() {
		if(createDao_12_03 == null) 
		createDao_12_03= new CreateDao_12_03();
		return createDao_12_03;
	}
	

	public static void main(String[] args) {
		CreateDao_12_03 obj1= new CreateDao_12_03().getInstance();
		System.out.println(obj1.hashCode());
		CreateDao_12_03 obj2= new CreateDao_12_03().getInstance();
		System.out.println(obj2.hashCode());
		
		// TODO Auto-generated method stub

	}

}
