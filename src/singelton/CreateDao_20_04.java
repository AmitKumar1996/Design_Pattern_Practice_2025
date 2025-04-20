package singelton;

public class CreateDao_20_04 {
	
	private CreateDao_20_04 createDao_20_04= null;
	private CreateDao_20_04 getInstance() {
		if(createDao_20_04 == null) {
			createDao_20_04= new CreateDao_20_04();
		}
		return createDao_20_04;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateDao_20_04 obj1= new CreateDao_20_04().getInstance();
		System.out.println(obj1.hashCode());
		CreateDao_20_04 obj2= new CreateDao_20_04().getInstance();
		System.out.println(obj2.hashCode());

	}

}
