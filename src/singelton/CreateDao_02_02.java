package singelton;

public class CreateDao_02_02 {
	
	private static CreateDao_02_02 createDao_02_02=null;
	
	private static CreateDao_02_02 getInstance() {
		
		if(createDao_02_02 == null) {
		createDao_02_02= new CreateDao_02_02();
	}
		return createDao_02_02;

	}
	public static void main(String[] args) {
		
		CreateDao_02_02 obj1=new CreateDao_02_02().getInstance();
		System.out.println(obj1.hashCode());
		
		
		CreateDao_02_02 obj2= new CreateDao_02_02().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
