package singelton;

public class CreateDao_02_03 {
	
	private  static CreateDao_02_03 createDao_02_03=null;
	
	private static CreateDao_02_03 getInstance() {
		if(createDao_02_03 == null) {
			
			createDao_02_03 = new CreateDao_02_03();
		}
		return createDao_02_03;
	}

	public static void main(String[] args) {
		
		CreateDao_02_03 obj1= new CreateDao_02_03().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_02_03 obj2= new CreateDao_02_03().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub
		CreateDao_02_03 obj3= new CreateDao_02_03().getInstance();
		
		System.out.println(obj3.hashCode());

	}

}
