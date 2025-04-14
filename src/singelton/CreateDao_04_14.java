package singelton;

public class CreateDao_04_14 {

	
	private static CreateDao_04_14 createDao_04_14=null;
	
	
	private static CreateDao_04_14 getInstance() {
		if(createDao_04_14 == null) {
			createDao_04_14 = new CreateDao_04_14();
		}
		return createDao_04_14;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateDao_04_14 obj1= new CreateDao_04_14().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_04_14 obj2= new CreateDao_04_14().getInstance();
		System.out.println(obj2.hashCode());

	}

}
