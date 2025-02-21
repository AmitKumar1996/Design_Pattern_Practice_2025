package singelton;

public class CreateDao_02_21 {

	
	private static  CreateDao_02_21 createDao=null;
	
	private static CreateDao_02_21 getInstance() {
		
		if(createDao == null) {
			createDao = new CreateDao_02_21();
		}
		return createDao;
	}
	
	public static void main(String[] args) {
		
		CreateDao_02_21 obj1= new CreateDao_02_21().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_02_21 obj2= new CreateDao_02_21().getInstance();
		
		System.out.println(obj2.hashCode());
		
		// TODO Auto-generated method stub

	}

}
