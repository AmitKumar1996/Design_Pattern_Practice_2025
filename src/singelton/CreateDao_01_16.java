package singelton;

public class CreateDao_01_16 {
	
	private static CreateDao_01_16 createDao_01_16=null;
	private static CreateDao_01_16 getInstance() {
		if(createDao_01_16 == null) {
			createDao_01_16 = new CreateDao_01_16();
		}
		return createDao_01_16;
	}

	public static void main(String[] args) {
		
		
		CreateDao_01_16 obj1= new CreateDao_01_16().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreateDao_01_16 obj2= new CreateDao_01_16().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub
		
CreateDao_01_16 obj3= new CreateDao_01_16().getInstance();
		
		System.out.println(obj3.hashCode());

	}

}
