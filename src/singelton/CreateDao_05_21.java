package singelton;

public class CreateDao_05_21 {
	
	private static CreateDao_05_21 createDao_05_21=null;
	
	private static CreateDao_05_21 getInstance() {
		
		if(createDao_05_21 == null) {
			createDao_05_21=new CreateDao_05_21();
			
		}
		return createDao_05_21;
	}

	public static void main(String[] args) {
		
		
		CreateDao_05_21 obj1=new CreateDao_05_21().getInstance();
		System.out.println(obj1.hashCode());
		
		
		CreateDao_05_21 obj2=new CreateDao_05_21().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
