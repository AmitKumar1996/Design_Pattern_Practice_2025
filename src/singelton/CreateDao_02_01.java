package singelton;

public class CreateDao_02_01 {
	
	private static CreateDao_02_01 createDao_02_01=null;
	
private CreateDao_02_01 getInstance() {
	
	if(createDao_02_01 == null) {
		createDao_02_01 = new CreateDao_02_01();
	}
	return createDao_02_01;
	
}
	public static void main(String[] args) {
		
		CreateDao_02_01 obj1= new CreateDao_02_01().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_02_01 obj2= new CreateDao_02_01().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
